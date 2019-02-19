package com.topisv.wms.output.basic.dao;

import com.topisv.wms.output.basic.po.ContainerPO;
import com.topisv.wms.output.basic.po.ContainerPOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContainerDao {
    int countByExample(ContainerPOExample example);

    int deleteByExample(ContainerPOExample example);

    int deleteByPrimaryKey(String id);

    int insert(ContainerPO record);

    int insertSelective(ContainerPO record);

    List<ContainerPO> selectByExample(ContainerPOExample example);

    ContainerPO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ContainerPO record, @Param("example") ContainerPOExample example);

    int updateByExample(@Param("record") ContainerPO record, @Param("example") ContainerPOExample example);

    int updateByPrimaryKeySelective(ContainerPO record);

    int updateByPrimaryKey(ContainerPO record);
}