package com.kaka.daytest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lu.Gong
 * @date 12/3/2019
 */
public class InstansofTest {
    public static void main(String[] args) {
        Object obj = new String [3];
        System.out.println(obj instanceof Array);
        List<String> list = new ArrayList<String>();
        if(obj instanceof Object[]){
            Object[] o = (Object[])obj;
            System.out.println(o.length);
        }


        list.add("aa");
        list.add("bb");
        list.add("cc");
        if(list.contains("cc")){
            list.remove("cc");
        }
        for (String str:list
             ) {
            System.out.println(str);
        }




    }
}
