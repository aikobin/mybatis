<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<link rel="apple-touch-icon" href="${ctx}/static/v3/assets/images/apple-touch-icon.png">
<link rel="shortcut icon" href="${ctx}/static/v3/assets/images/favicon.ico">

<!-- Stylesheets -->
<link href="${ctx}/static/v3/global/css/bootstrap.min.css-v2.2.0" rel="stylesheet">
<link href="${ctx}/static/v3/global/css/bootstrap-extend.min.css-v2.2.0" rel="stylesheet">
<link href="${ctx}/static/v3/assets/css/site.min.css-v2.2.0" rel="stylesheet">

<!-- Plugins -->
 <link rel="stylesheet" href="${ctx}/static/v3/global/vendor/animsition/animsition.min.css-v2.2.0">
 <link rel="stylesheet" href="${ctx}/static/v3/global/vendor/jquery-mmenu/jquery-mmenu.min.css-v2.2.0">
<%--<link rel="stylesheet" href="${ctx}/static/v3/global/vendor/asscrollable/asScrollable.min.css-v2.2.0">
<link rel="stylesheet" href="${ctx}/static/v3/global/vendor/switchery/switchery.min.css-v2.2.0">
<link rel="stylesheet" href="${ctx}/static/v3/global/vendor/intro-js/introjs.min.css-v2.2.0">
<link rel="stylesheet" href="${ctx}/static/v3/global/vendor/slidepanel/slidePanel.min.css-v2.2.0">
<link rel="stylesheet" href="${ctx}/static/v3/global/vendor/flag-icon-css/flag-icon.min.css-v2.2.0"> --%>

<!-- Fonts -->
<link href="${ctx}/static/v3/global/fonts/web-icons/web-icons.min.css-v2.2.0" rel="stylesheet">
<link href="${ctx}/static/v3/global/fonts/brand-icons/brand-icons.min.css-v2.2.0" rel="stylesheet">
<%-- <link rel='stylesheet' href="${ctx}/static/v3/global/fonts/roboto.css"> --%>
<link rel="stylesheet" href="${ctx}/static/v3/global/fonts/font-awesome/font-awesome.min.css-v2.2.0">

<!-- Plugins For This Page -->

<%-- <link rel="stylesheet" href="${ctx}/static/v3/global/vendor/select2/select2.min.css-v2.2.0" > --%>
<%-- <link href="${ctx}/static/v3/global/vendor/chartist-js/chartist.min.css-v2.2.0" rel="stylesheet">
<link href="${ctx}/static/v3/global/vendor/jvectormap/jquery-jvectormap.min.css-v2.2.0" rel="stylesheet">
<link rel="stylesheet" href="${ctx}/static/v3/assets/examples/css/dashboard/analytics.min.css-v2.2.0">
<link rel="stylesheet" href="${ctx}/static/v3/assets/examples/css/forms/advanced.min.css-v2.2.0"> --%>


<!--[if lt IE 9]>
<script src="${ctx}/static/v3/global/vendor/html5shiv/html5shiv.min.js"></script>
<![endif]-->

<!--[if lt IE 10]>
<script src="${ctx}/static/v3/global/vendor/media-match/media.match.min.js"></script>
<script src="${ctx}/static/v3/global/vendor/respond/respond.min.js"></script>
<![endif]-->

<script type="text/javascript">
    window.ctx = "${ctx}";
</script>


<!-- jQuery 2.0.0 -->
<script src="${ctx}/static/v3/js/jquery-2.0.0.min.js"></script>
<script src="${ctx}/static/v3/js/jquery.form.js"></script>
<script type='text/javascript' src="${ctx}/static/chart/Chart-1.0.1-beta.4.js"></script>

<!-- Lodop打印控件 -->
<script type='text/javascript' src="http://127.0.0.1:8000/CLodopfuncs.js"></script>
<script type='text/javascript' src="${ctx}/static/v3/js/paiu/LodopFuncs.js"></script>
<script type='text/javascript' src="${ctx}/static/v3/js/paiu/CaiNiaoPrintFuncs.js"></script>
<script type='text/javascript' src="${ctx}/static/v3/js/paiu/print.js"></script>
<script type="text/javascript" src="${ctx}/static/v3/js/template.js"></script>


<!-- 进度条 -->
<script type='text/javascript' src="${ctx}/static/v3/js/paiu/hide.js"></script>
<script type='text/javascript' src="${ctx}/static/v3/js/paiu/invoicePrint.js"></script>
<link href="${ctx}/static/v3/css/hide.css" rel="stylesheet" type="text/css"/>

<!-- alert -->
<link href="${ctx}/static/v3/global/vendor/jalert/jquery.alerts.css" rel="stylesheet" type="text/css"/>
<script type='text/javascript' src="${ctx}/static/v3/global/vendor/jalert/jquery.alerts.js"></script>

<!-- 上传附件的插件 -->
<link href="${ctx}/static/v3/global/vendor/uploadify/uploadify.css" type="text/css" rel="stylesheet"/>
<script src="${ctx}/static/v3/global/vendor/uploadify/jquery.uploadify.js" type="text/javascript"></script>

<link href="${ctx}/static/v3/global/vendor/bootstrap-fileinput/css/fileinput.min.css" type="text/css" rel="stylesheet"/>
<script src="${ctx}/static/v3/global/vendor/bootstrap-fileinput/js/fileinput.min.js" type="text/javascript"></script>
 
<!-- 表单验证 -->
<link href="${ctx}/static/jquery-validation/1.10.0/validate.css" type="text/css" rel="stylesheet"/>
<script src="${ctx}/static/jquery-validation/1.10.0/jquery.validate.min.js" type="text/javascript"></script>
<script src="${ctx}/static/jquery-validation/1.10.0/messages_bs_zh.js" type="text/javascript"></script>
<!-- 语音播报 -->
<%--<script src="${ctx}/static/speech/jQuery.speech.min.js"></script>--%>
<script src="http://iwmshq.whalehouse.com/iwms/static/speech/jQuery.speech.min.js"></script>
<!-- dataTables -->
<link rel="stylesheet" href="${ctx}/static/v3/global/vendor/datatables-bootstrap/dataTables.bootstrap.min.css">
<script src="${ctx}/static/v3/global/vendor/datatables/jquery.dataTables.v4.min.js"></script>
<script src="${ctx}/static/v3/global/vendor/datatables-bootstrap/dataTables.bootstrap.min.js"></script>
<script src="${ctx}/static/v3/global/vendor/datatables-colReorder/dataTables.colReorder.js"></script>
<script src="${ctx}/static/v3/global/vendor/datatables-buttons/dataTables.buttons.js"></script>
<script src="${ctx}/static/v3/global/vendor/datatables-buttons/buttons.colVis.js"></script>
<script src="${ctx}/static/v3/js/paiu/dataTable.defaults.js"></script>


<!-- Core -->
<script src="${ctx}/static/v3/global/vendor/bootstrap/bootstrap.min.js"></script>
<script src="${ctx}/static/v3/global/vendor/animsition/animsition.min.js"></script>
<%-- <script src="${ctx}/static/v3/global/vendor/asscroll/jquery-asScroll.min.js"></script>
<script src="${ctx}/static/v3/global/vendor/mousewheel/jquery.mousewheel.min.js"></script> --%>
<script src="${ctx}/static/v3/global/vendor/asscrollable/jquery.asScrollable.all.min.js"></script>
<%-- <script src="${ctx}/static/v3/global/vendor/ashoverscroll/jquery-asHoverScroll.min.js"></script> --%>

<!-- Plugins -->
<%-- <script src="${ctx}/static/v3/global/vendor/switchery/switchery.min.js"></script>
<script src="${ctx}/static/v3/global/vendor/intro-js/intro.min.js"></script>
<script src="${ctx}/static/v3/global/vendor/screenfull/screenfull.min.js"></script>
<script src="${ctx}/static/v3/global/vendor/slidepanel/jquery-slidePanel.min.js"></script> --%>


<!-- 菜单 -->
<script src="${ctx}/static/v3/global/vendor/jquery-mmenu/jquery.mmenu.min.all.js"></script>
<script src="${ctx}/static/v3/global/js/core.min.js"></script>
<script src="${ctx}/static/v3/assets/js/site.min.js"></script>


<!-- matchheight -->
<%-- <script src="${ctx}/static/v3/global/js/components/matchheight.min.js"></script> --%>

<!-- panel operation -->
<script src="${ctx}/static/v3/global/js/components/animate-list.min.js"></script>
<script src="${ctx}/static/v3/global/js/components/panel.min.js"></script>
<script src="${ctx}/static/v3/assets/examples/js/layouts/panel-transition.min.js"></script>


<script src="${ctx}/static/v3/global/js/components/asscrollable.min.js"></script>
<script src="${ctx}/static/v3/global/js/components/animsition.min.js"></script>
<script src="${ctx}/static/v3/global/js/components/slidepanel.min.js"></script>
<script src="${ctx}/static/v3/global/js/components/switchery.min.js"></script>

<%-- <script src="${ctx}/static/v3/global/js/configs/config-colors.min.js"></script>
<script src="${ctx}/static/v3/assets/js/configs/config-tour.min.js"></script> --%>

<!-- chosen -->
<link rel="stylesheet" href="${ctx}/static/v3/global/vendor/chosen/chosen.min.css">
<script src="${ctx}/static/v3/global/vendor/chosen/chosen.jquery.js"></script>

<!-- Date Picker -->
<link rel="stylesheet" href="${ctx}/static/v3/global/vendor/bootstrap-datepicker/bootstrap-datepicker.min.css-v2.2.0"> 
<script src="${ctx}/static/v3/global/vendor/bootstrap-datepicker/bootstrap-datepicker.min.js"></script>
<script src="${ctx}/static/v3/global/vendor/bootstrap-datepicker/bootstrap-datepicker.zh-CN.min.js"></script>
<script src="${ctx}/static/v3/global/js/components/bootstrap-datepicker.min.js"></script>


<!-- bootstrap-datetimepicker -->
<script src="${ctx}/static/v3/global/vendor/bootstrap-datetimepicker/bootstrap-datetimepicker.min.js" type="text/javascript"></script>
<link href="${ctx}/static/v3/global/vendor/bootstrap-datetimepicker/bootstrap-datetimepicker.min.css" type="text/css" rel="stylesheet"/>
<script charset="UTF-8" src="${ctx}/static/v3/global/vendor/bootstrap-datetimepicker/bootstrap-datetimepicker.zh-CN.js"></script>


<!-- jedate -->
<link href="${ctx}/static/v3/global/vendor/jedate/skin/jedate.css" type="text/css" rel="stylesheet"/>
<script src="${ctx}/static/v3/global/vendor/jedate/jquery.jedate.min.js" type="text/javascript"></script>


<!-- daterangepicker -->
<link rel="stylesheet" href="${ctx}/static/v3/global/vendor/bootstrap-daterangepicker/daterangepicker-bs3.css">
<script src="${ctx}/static/v3/global/vendor/bootstrap-daterangepicker/daterangepicker.js"></script>

<!-- icheck -->
<link rel="stylesheet" href="${ctx}/static/v3/global/vendor/icheck/icheck.min.css-v2.2.0">
<script src="${ctx}/static/v3/global/vendor/icheck/icheck.min.js"></script>
<script src="${ctx}/static/v3/global/js/components/icheck.min.js"></script>


<!-- 自定义js文件 -->
<script type='text/javascript' src="${ctx}/static/v3/js/paiu/wms_common.js"></script>
<script type='text/javascript' src="${ctx}/static/v3/js/paiu/wms_page_common.js"></script>
<script type='text/javascript' src="${ctx}/static/v3/js/paiu/wms_util.js"></script>
<script type='text/javascript' src="${ctx}/static/v3/js/paiu/ajaxQueue.js"></script>


<script src="${ctx}/static/requirejs/require.js"></script>
<script src="${ctx}/static/requirejs/require.config.js"></script>

<link rel="stylesheet" href="${ctx}/static/v3/global/vendor/multi-select/bootstrap-multiselect.css">
<script type='text/javascript' src="${ctx}/static/v3/global/vendor/multi-select/bootstrap-multiselect.js"/>
<script  src="${ctx}/static/v3/global/vendor/bootstrap-fileinput/js/locales/zh.js" type="text/javascript></script>