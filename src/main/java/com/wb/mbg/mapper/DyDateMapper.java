package com.wb.mbg.mapper;

import com.wb.mbg.model.DyDate;
import com.wb.mbg.model.DyDateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DyDateMapper {
    long countByExample(DyDateExample example);

    int deleteByExample(DyDateExample example);

    int insert(DyDate record);

    int insertSelective(DyDate record);

    List<DyDate> selectByExample(DyDateExample example);

    int updateByExampleSelective(@Param("record") DyDate record, @Param("example") DyDateExample example);

    int updateByExample(@Param("record") DyDate record, @Param("example") DyDateExample example);
}