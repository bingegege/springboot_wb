package com.wb.service;

import com.wb.domain.SysLog;

import java.util.List;

public interface SysLogService {
    List<SysLog> findAll();

    int save(SysLog log);
}
