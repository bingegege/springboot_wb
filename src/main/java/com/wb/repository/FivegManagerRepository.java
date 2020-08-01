package com.wb.repository;

import com.wb.domain.FivegManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FivegManagerRepository extends JpaRepository<FivegManager,Integer> {
//    public List<FivegManager> findAll();
//    List<FivegManager> finfById(Integer id);
//    @Query("select f from fiveg_manager f where f.id=?1")
//    FivegManager findById(Integer id);
}
