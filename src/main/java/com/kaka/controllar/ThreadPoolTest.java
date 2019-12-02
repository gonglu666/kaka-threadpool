package com.kaka.controllar;

import com.kaka.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lu.Gong
 * @date 12/2/2019
 */

@RestController
public class ThreadPoolTest {


    @Autowired
    AsyncService asyncService;


    @RequestMapping("/async")
    public String testAsynThread(){
        return "success-async";
    }


    @RequestMapping("/sync")
    public String testSynThread(){
        System.out.println("success-sync");
        return "success-sync";
    }

    @RequestMapping(value = "/async/noreturn",method = RequestMethod.GET)
    public String noReturnAsycnThread(){
        System.out.println(Thread.currentThread().getName()+":the async no return controllar start...");
        try {
            asyncService.noReturnTest();
        } catch (InterruptedException e) {
            return "asycn-noreturn-error";
        }
        System.out.println(Thread.currentThread().getName()+":the async no return controllar end...");
        return "asycn-noreturn-success";
    }

    @RequestMapping(value = "/async/noreturn/ex",method = RequestMethod.GET)
    public String noReturnAsycnThreadWithException(@RequestParam ("number") int num){
        System.out.println(Thread.currentThread().getName()+":the async no return ex controllar start...");
        try {
            asyncService.noReturnTestForInt(num);
        } catch (InterruptedException e) {
            return "asycn-noreturn-error";
        }
        System.out.println(Thread.currentThread().getName()+":the async no return ex controllar end...");
        return "asycn-noreturn-success";
    }

    @RequestMapping(value = "/async/noreturn/bb",method = RequestMethod.GET)
    public String noReturnAsycnThreadWithBeanName(){
        System.out.println(Thread.currentThread().getName()+":the async no return bb controllar start...");
        try {
            asyncService.noReturnTestWithBeanName();
        } catch (InterruptedException e) {
            return "asycn-noreturn-error";
        }
        System.out.println(Thread.currentThread().getName()+":the async no return bb controllar end...");
        return "asycn-noreturn-success";
    }


}
