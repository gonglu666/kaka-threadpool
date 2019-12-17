package com.kaka.common;

import com.kaka.BaseTest;
import com.kaka.service.AsyncService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Lu.Gong
 * @date 12/16/2019
 */


public class CommonTest  extends BaseTest {


    @Autowired
    AsyncService asyncService;


    @Before
    public void setUp() throws Exception {
        System.out.println("common-before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("common-after");
    }

    @Test
    public void testAsynThread() throws Exception {
        asyncService.noReturnTest();
        System.out.println("common-333");
    }
}
