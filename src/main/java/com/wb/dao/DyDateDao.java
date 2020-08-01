package com.wb.dao;

import com.wb.mbg.model.DyDate;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface DyDateDao {
    @Select("select * from dy_date where gNBID=#{id}" )
    @Results({
            @Result(property = "rsrpUl", column = "RSRP_UL"),
            @Result(property = "rsrpDl", column = "RSRP_DL"),
//            @Result(property = "orderStatus", column = "orderStatus"),
//            @Result(property = "peopleCount", column = "peopleCount"),
//            @Result(property = "peopleCount", column = "peopleCount"),
//            @Result(property = "payType", column = "payType"),
//            @Result(property = "orderDesc", column = "orderDesc"),
    })
    List<DyDate> findById(int id);
}
