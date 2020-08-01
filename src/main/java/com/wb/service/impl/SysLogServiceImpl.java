package com.wb.service.impl;

import com.wb.dao.SysLogDao;
import com.wb.domain.SysLog;
import com.wb.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SysLogServiceImpl implements SysLogService{
    @Autowired
    private SysLogDao sysLogDao;

    @Override
    public List<SysLog> findAll() {
        return sysLogDao.findAll();
    }

    @Override
    public int save(SysLog log) {
        return sysLogDao.save(log);
    }
}
