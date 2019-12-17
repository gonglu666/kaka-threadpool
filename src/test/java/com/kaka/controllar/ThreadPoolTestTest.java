package com.kaka.controllar;

import com.kaka.BaseTest;
import com.kaka.service.AsyncService;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Lu.Gong
 * @date 12/16/2019
 */



@Ignore
public class ThreadPoolTestTest extends BaseTest {

    @Autowired
    AsyncService asyncService;


    @Before
    public void setUp() throws Exception {
        System.out.println("controllar-before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("controllar-after");
    }

    @Test
    public void testAsynThread() throws Exception {
        asyncService.noReturnTest();
        System.out.println("controllar-111");
    }

    @Test
    public void testSynThread() throws Exception {
        asyncService.kakaTest();
        System.out.println("controllar-222");
    }



}
