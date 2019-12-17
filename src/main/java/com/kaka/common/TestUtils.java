package com.kaka.common;

import io.lettuce.core.dynamic.annotation.Command;
import org.springframework.stereotype.Component;

/**
 * @author Lu.Gong
 * @date 12/16/2019
 */
@Component
public class TestUtils {

    public void print(String str){
        System.out.println("TestUtil-"+str);
    }
}
