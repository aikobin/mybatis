var datatable_content;

String.format = function (s) {
    var t = s;
    for (var i = 1; i < arguments.length; i++) {
        t = t.replace(eval("/\\{" + (i - 1) + "\\}/ig"), arguments[i]);
    }
    return t;
};


$(function(){
    $("#barcode").focus();
    registerRememberSelected('local');
    $("#barcode").keydown(function(event) {
    		event = event || window.event;
        if (event.keyCode == "13") {//keyCode=13是回车键
            var barCode = $("#barcode").val();
            var warehouseCode = $("#warehouseCode").val();
          

            if(!barCode){
                jAlert("请扫描清单/面单", '提示', function() {
                		$("#barcode").focus();
                });
                return;
            }

            $.ajax({
                type : 'post',
                url : ctx+'/orderReview/initOrderReviewInfo',
                data : {
                	scanOrderCode: barCode,
                	warehouseCode: warehouseCode
                },
                dataType : 'json',
                success : function(data) {
                    if(data.status==1){
                        $('#barcode').attr('disabled',true);
                        $('#fromNo').html(data.content.fromNo);
                        initSkuDetail(data);
                        if(data.content.cancel){
                            jConfirm("该订单已取消，请移至取消区","温馨提示",function (r) {
                                if(r){
                                    document.location.href=ctx+"/orderReview/toOrderReviewPage";
                                }
                            })
                            return;
                        }
                        $('#btnForceFinish').prop('disabled', '');
                		$("#orderNo").val(data.content.orderNo);
                		$("#customerCode").val(data.content.customerCode);
                		if (data.content.needsConfirmBoxpn) {
                			$('.time').show();
                			$('video').show();
                			startRec(data.content.fileName, data.content.dir);
                		} else {
                			$('.time').hide();
                			$('video').hide();
                		}
                        $('#skuCode').focus();
                    }else {
                        jAlert(data.message, '提示', function() {
                        		$('#barcode').select();
                        		$('#barcode').focus();
                        });
                    }

                }
            });


        }
    });


    $("#skuCode").keydown(function(event) {
    		event = event||window.event;
        if (event.keyCode == "13") {//keyCode=13是回车键
            var barCode = $("#skuCode").val();
            if(!barCode){
                jAlert("商品条码不能为空", '提示', function() {
                		$("#skuCode").focus();
                });
                return;
            }
            var warehouseCode = $("#warehouseCode").val();
            
            var customerCode=$("#customerCode").val();
            if(!customerCode){
                jAlert("客户不能为空");
                return;
            }
            var orderNo=$("#orderNo").val();
            if(!orderNo){
                jAlert("订单号不能为空");
                return;
            }
            var vvdate={"warehouseCode":warehouseCode,"customerCode":customerCode,"orderNo":orderNo,"barCode":barCode};
            $.ajax({
                type : 'post',
                url : ctx+'/orderReview/scanSku',
                data : vvdate,
                dataType : 'json',
                success : function(data) {
                    if(data.status==1){
                        $("#skuCode").val("");
                        $('#fromNo').html(data.content.fromNo);
                        if(data.content.cancel){
                    		stopRec(1);
                    		jAlert("该订单已取消，请移至取消区","温馨提示",function (r) {
                                document.location.href=ctx+"/orderReview/toOrderReviewPage";
                                return;
                            })
                            return;
                        }
                        if(data.content.outOf){
                        		stopRec(1);
                            jAlert(data.content.tipMsg,"温馨提示",function(){
                                document.location.href=ctx+"/orderReview/toOrderReviewPage";
                                return;
                            });
                            return;
                        }
                        
                        var skuFinished = true;

                        var barXiushi =   data.content.currScanBarCode;
                       // var clazz = String.format(".tr-{0}-{1}-{2}", data.content.fromNo, data.content.orderNo, data.content.currScanBarCode);
                        var clazz = String.format('[findFlag="{0}-{1}-{2}"]', data.content.fromNo, data.content.orderNo,barXiushi);
            			$(clazz).each(function() {
            				var waitQty = $(this).find('.wait').data('qty');
            				var packagedQty = $(this).find('.packaged').data('qty');
            				if (packagedQty < waitQty) {
            					$(this).find('.packaged').data('qty', (packagedQty + 1));
            					$(this).find('.packaged').text((packagedQty + 1));
            					skuFinished = false;
            				}
            			});
            			
            			var finished = true;
            			$('.tr-packages').each(function() {
            				var waitQty = $(this).find('.wait').data('qty');
            				var packagedQty = $(this).find('.packaged').data('qty');
            				if (waitQty != packagedQty) {
            					finished = false;
            				}
            			})
                			
                        // initSkuDetail(data); data.content.done

            			
            			//bin
            			$('#skuItem tr').each(function() {
            				var tagFlag = $(this).children('td').get(5).innerHTML;
            				var barCode = $(this).children('td').get(1).innerHTML;
            				if(tagFlag =='是'){
            					alert("条码:"+barCode+" 需要重新贴条码");
            				}     				
            			});
            
            			
            			
            			
                        if(finished) {
                    		$("#orderNo").val(data.content.orderNo);
                        	if (data.content.needsConfirmBoxpn) {
                        		$("#boxPn").text(data.content.boxPn ? data.content.boxPn : '-');
                        	    $("#confirmBoxpn").val('');
                        		$("#inputDialog").modal('show');
                        	} else {
                        		confirmBoxpn();
                        	}
                        } else {
            				$("#skuCode").focus();
                			
                			if (skuFinished) {
                				jAlert('该商品已复核完成');
                			}
                        }
                    }else {
                        jAlert(data.message, '提示', function() {
                        	$("#skuCode").val("");
                            $("#skuCode").focus();
                        });
                    }


                }
            });


        }
    });
    
    $("#warehouseCode").change(function() {
    	$("#barcode").val('');
    	$("#barcode").focus();
    	$('#barcode').attr('disabled',false);
        $('#fromNo').html('');
        $('#btnForceFinish').prop('disabled', 'disabled');
		$("#orderNo").val('');
		$('#skuItem').html('');
		getOrders();
    })
    
    $("#confirmBoxpn").keydown(function(e) {
    	e = e||window.event;
		if (e.keyCode == 13) {
			confirmBoxpn();
		}
    })
    
    $('#inputDialog').on('shown.bs.modal',function(e){
		$("#confirmBoxpn").focus();
	});
});

function confirmBoxpn(){
	var warehouseCode = $("#warehouseCode").val();
	var customerCode = $("#customerCode").val();
	var orderNo=$("#orderNo").val();
	var confirmBoxpn=$("#confirmBoxpn").val();
	var barCodes = new Array();
	
	$('.tr-packages').each(function() {
		barCodes.push($(this).data('barcode'));
	})
	$.ajax({
        type : 'post',
        url : ctx + '/orderReview/confirmBoxpn',
        data: {warehouseCode:warehouseCode,customerCode:customerCode,orderNo: orderNo, confirmBoxpn: confirmBoxpn, barCodes: barCodes.join(','),macName:''},
        success : function(data) {
            if (data.status == "1") {
            	$("#inputDialog").modal('hide');
            	
            	if(data.content.cancel){
            		stopRec(1);
            		jAlert("该订单已取消，请移至取消区","温馨提示",function (r) {
            			window.location.reload();
                    })
                    return;
                }
                if(data.content.outOf){
            		stopRec(1);
                    jAlert(data.content.tipMsg,"温馨提示",function(){
                    	window.location.reload()
                    });
                    return;
                }
            	
	    		print(orderNo);
	            
	            $("#barcode").val('');
	        	$('#barcode').attr('disabled',false);
	            $('#fromNo').html('');
	            $('#btnForceFinish').prop('disabled', 'disabled');
	    		$("#orderNo").val('');
	    		$('#skuItem').html('');
	        	$("#barcode").focus();
	            
	            stopRec('');
            	if(data.content.done){
            		$('#finishTip').html('订单复核完成');
            		$('#finishTip').speech({
                        "speech": false,
                        "speed": 5
                    });
            		getOrders();
    	        	$("#barcode").focus();
                    //jAlert("订单包装完成","温馨提示",function (r) {
                    //	window.location.reload()
                    //})
                    return false;
                }
            } else {
                jAlert(data.message,'温馨提示', function() {
                	$("#confirmBoxpn").select();
                	$("#confirmBoxpn").focus();
                });
            }
        }
	 });
}

function initSkuDetail(data) {
    $('#skuItem').html('');
    var skuHtml = '';
    each(data.content.packingBOList, function(idx, o) {
      //  skuHtml += String.format('<tr class="tr-packages tr-{0}-{1}-{2}" data-barcode="{2}" data-sku="{3}">', o.fromNo, o.orderNo,o.barCode,o.skuCode);
        var barXiushi =   o.barCode;
        skuHtml += String.format('<tr  class="tr-packages tr-{0}-{1}-{2}" findFlag="{0}-{1}-{2}" data-barcode="{2}" data-sku="{3}">', o.fromNo, o.orderNo,barXiushi,o.skuCode);
        skuHtml += '<td>'+o.skuCode+ "</td>";
        skuHtml += '<td>'+o.barCode+ "</td>";
        skuHtml += '<td>'+o.skuname+ "</td>";
        skuHtml += String.format('<td class="wait" data-qty="{0}">{0}</td>', o.waitPackQuantity);
        skuHtml += String.format('<td class="packaged" data-qty="{0}">{0}</td>', o.packingnum?o.packingnum:0);
        //bin
        var tagVal = '否'
        if(o.tagFlag == 1){
        	tagVal = '是'
        }
        
        skuHtml += String.format('<td>{0}</td>', tagVal);
        // skuHtml += '<td >' + o.packingnum + '</td>';
        skuHtml += '</tr>';
    });
    $('#skuItem').html(skuHtml);
}

//强制完成
function forceFinish(){
	 var barCode = $("#barcode").val();
     if(!barCode){
         jAlert("请扫描清单/面单", '提示', function() {
         		$("#barcode").focus();
         });
         return;
     }
     var warehouseCode = $("#warehouseCode").val();
     
     var customerCode=$("#customerCode").val();
     if(!customerCode){
         jAlert("客户不能为空");
         return;
     }
     var orderNo=$("#orderNo").val();
     if(!orderNo){
         jAlert("订单号不能为空");
         return;
     }
     
	var packeds = new Array();
	$('.tr-packages').each(function() {
		var packed = {};
		packed.skuCode = $(this).data('sku');
		packed.barCode = $(this).data('barcode');
		packed.qty = $(this).find('.packaged').data('qty');
		packeds.push(packed);
	})
	var data = { warehouseCode:warehouseCode,customerCode:customerCode,orderNo: orderNo, packeds: packeds };

    jConfirm("确认要强制完成该批次或订单的复核吗？","温馨提示",function (r) {
        if(r){
            $.ajax({
                type : 'post',
                url : ctx+'/orderReview/forceFinish',
                contentType: "application/json",
                data: JSON.stringify(data),
                success : function(data) {
                    if(data.status==1){
                        if(data.content.cancel){
                            jAlert("该订单已取消，请移至取消区","温馨提示",function(){
                            	window.location.reload()
                                return;
                            });
                        }

                        jAlert("订单缺货，请移到缺货区","温馨提示",function(){
                        	window.location.reload()
                            return;
                        });

                        $('#barcode').attr('disabled',false);
                        $('#barcode').val('');
                        $('#barcode').focus();
                        stopRec('');
                        setTimeout(function() { window.location.reload() }, 1000);
                        
                    }else {
                        jAlert(data.message);
                    }

                }
            });
        }
    })

}


function getOrders() {
    var warehouseCode = $("#warehouseCode").val();
    $.ajax({
        type : 'post',
        // url : ctx+'/packing/initSinglePkg?containerCode='+containerCode,
        url : ctx+'/orderReview/selectByTodayAndOperator?warehouseCode=' + warehouseCode,
        dataType : 'json',
        success : function(data) {
            if(data.status==1){
                $('#orderCcontent').html("");
                $('#qualityCount').html('-');
                if(data.content.length>0){
                    $('#qualityCount').html(data.content[0].orderQty);
                    var cententHtml="";
                    each(data.content, function(idx, o) {
                        cententHtml += '<tr>';
                        cententHtml += '<td>'+o.fromNo+ "</td>";
                        cententHtml += '<td>' + o.expressNo + '</td>';
                        cententHtml += '<td>' + o.skuNum + '</td>';
                        cententHtml += '<td>' + o.createOwner + '</td>';
                        cententHtml += '<td>' + o.doneTime + '</td>';
                        cententHtml += '</tr>';
                    });
                    $('#orderCcontent').html(cententHtml);
                }
            }else {
                jAlert(data.message);
            }

        }
    });

}


function print(data) {
	startPrint(data, "post", false, function() { });
}
