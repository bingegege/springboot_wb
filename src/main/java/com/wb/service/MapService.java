package com.wb.service;

import com.wb.mbg.model.DyDate;
import com.wb.mbg.model.FivegManagers;

import java.util.List;

public interface MapService {
    FivegManagers findManagerByName(String username);

    List<DyDate> findById(int id);

    int save(FivegManagers managers);

    List<FivegManagers> findAll();
}
