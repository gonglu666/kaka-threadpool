package com.kaka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Lu.Gong
 * @date 12/16/2019
 */


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties={"spring.profiles.active=test",
                "spring.datasource.initialize=true",
                "test.class.name=BaseTest",
                "spring.datasource.schema=classpath:set-up.sql",
                "spring.datasource.data=classpath:common-data.sql"})
public abstract class BaseTest {

//    @Test
    public void init(){
        System.out.println("begin Junit Test ...");
    }


}
