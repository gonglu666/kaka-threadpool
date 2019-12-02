package com.kaka.handler;

import com.alibaba.fastjson.JSONObject;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

import java.lang.reflect.Method;

/**
 * @author Lu.Gong
 * @date 12/2/2019
 */
public class AsyncExceptionHandler implements AsyncUncaughtExceptionHandler {
    @Override
    public void handleUncaughtException(Throwable throwable, Method method, Object... params) {
        String format = String.format("Async method: {%s} has uncaught exception,params:{%s}",
                method.getName(), JSONObject.toJSON(params));
        System.out.println(format);

        throwable.printStackTrace();
        System.out.println("modify for dev1");
    }


}
