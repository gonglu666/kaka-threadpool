package com.kaka.config;

import com.kaka.common.WorkerPoolManager;
import com.kaka.handler.AsyncExceptionHandler;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync
public class AsyncConfig implements AsyncConfigurer {

    private final String asyncTaskExecutor = "asyncTaskExecutor";



    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return new AsyncExceptionHandler();
    }
    

    @Override
    @Bean(asyncTaskExecutor)
    public Executor getAsyncExecutor() {
        return WorkerPoolManager.getInstance().getAsyncExecutor();
	}

    @Bean
	public Executor getExecutor(){
        return WorkerPoolManager.getInstance().getSyncExecutor();
    }

    @Bean("kaka")
    public Executor getAsyn() {
        return WorkerPoolManager.getInstance().getKaka();
    }

}
