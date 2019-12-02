package com.kaka.service.impl;

import com.kaka.service.AsyncService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author Lu.Gong
 * @date 12/2/2019
 */

@Service
public class AsynSericeImpl implements AsyncService{

    @Async()
    @Override
    public void noReturnTest() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+":the no return asyc thread start...");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+":the no return asyc thread end...");
    }



    /**
     * 此方法给定了@Async的参数，参数中返回的是一个“同步线程池”，所以方法中对调用同步线程池
     * @throws InterruptedException
     */
    @Async("getExecutor")
    @Override
    public void noReturnTestWithBeanName() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+":the no return asyc thread start...");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName()+":the no return asyc thread end...");
    }

    @Async()
    @Override
    public void noReturnTestForInt(int num) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+":the no return asyc for int thread start...");
        Thread.sleep(2000);
        System.out.println(calc(num));

        System.out.println(Thread.currentThread().getName()+":the no return asyc for int thread end...");
    }

    private int calc(int num){
        return 100/num;
    }


}
