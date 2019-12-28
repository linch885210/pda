package com.song.mybatistest.dao;

import com.song.mybatistest.bean.SysResources;
import com.song.mybatistest.bean.SysResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysResourcesMapper {
    int countByExample(SysResourcesExample example);

    int deleteByExample(SysResourcesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysResources record);

    int insertSelective(SysResources record);

    List<SysResources> selectByExample(SysResourcesExample example);

    SysResources selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysResources record, @Param("example") SysResourcesExample example);

    int updateByExample(@Param("record") SysResources record, @Param("example") SysResourcesExample example);

    int updateByPrimaryKeySelective(SysResources record);

    int updateByPrimaryKey(SysResources record);
}