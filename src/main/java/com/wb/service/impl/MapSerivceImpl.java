package com.wb.service.impl;

import com.wb.dao.DyDateDao;
import com.wb.dao.FivegManagersDao;
import com.wb.mbg.model.DyDate;
import com.wb.mbg.model.FivegManagers;
import com.wb.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class MapSerivceImpl implements MapService {
    @Autowired
    private FivegManagersDao fivegManagersDao;

    @Autowired
    private DyDateDao dyDateDao;

    @Override
    public FivegManagers findManagerByName(String username) {
        return fivegManagersDao.findManagerByName(username);
    }

    @Override
    public List<DyDate> findById(int id) {
        return dyDateDao.findById(id);
    }

    @Override
    public int save(FivegManagers managers) {
        return fivegManagersDao.save(managers);
    }

    @Override
    public List<FivegManagers> findAll() {
        return fivegManagersDao.findAll();
    }
}
