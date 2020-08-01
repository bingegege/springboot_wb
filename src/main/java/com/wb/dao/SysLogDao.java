package com.wb.dao;

import com.wb.domain.SysLog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SysLogDao {
    @Select("select * from syslog")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="visitTime",property="visitTime"),
            @Result(column="ip",property="ip"),
            @Result(column="url",property="url"),
            @Result(column="executionTime",property="executionTime"),
            @Result(column="method",property="method"),
            @Result(column="username",property="username")
    })
    List<SysLog> findAll();


    @Insert("insert into syslog(visitTime,ip,url,executionTime,method) values(#{visitTime},#{ip},#{url},#{executionTime},#{method})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int save(SysLog log);
}
