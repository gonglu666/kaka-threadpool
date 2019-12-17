package com.kaka.service.impl;


import com.kaka.BaseTest;
import com.kaka.common.TestUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

/**
 * @author Lu.Gong
 * @date 12/16/2019
 */


public class AsynSericeImplTest extends BaseTest{


    @Autowired
    TestUtils testUtils;

    @Before
    public void setUp() throws Exception {
        System.out.println("service-before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("service-after");
    }

    @Test
    public void noReturnTest() throws Exception {
        testUtils.print("111");
        System.out.println("service-noReturnTest");
    }

    @Test
    public void kakaTest() throws Exception {
        testUtils.print("222");
        System.out.println("service-kakaTest");
    }



}
