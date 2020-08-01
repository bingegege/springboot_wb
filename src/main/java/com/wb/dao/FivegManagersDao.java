package com.wb.dao;

import com.wb.mbg.model.FivegManagers;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface FivegManagersDao {
    @Select("select * from fiveg_managers where username=#{username}")
    FivegManagers findManagerByName(String username);

    @Insert("insert into fiveg_managers(username,password) values(#{username},#{password})")
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")
    int save(FivegManagers managers);

    @Select("select * from fiveg_managers")
    List<FivegManagers> findAll();

}
