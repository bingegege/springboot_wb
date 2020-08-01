package com.wb;

import com.wb.domain.FivegManager;
import com.wb.repository.FivegManagerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {
    @Autowired
    private FivegManagerRepository fivegManagerRepository;

    @Test
    public void test(){
        List<FivegManager> temp=fivegManagerRepository.findAll();
        System.out.println(temp);
        System.out.println(temp.getClass());
    }
}
