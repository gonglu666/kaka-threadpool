package com.kaka.common;


import com.kaka.util.KakaNameThreadFactory;

import java.util.concurrent.*;

/*
 * Managing the pools in spog application
 * eric.yu
 */
public class WorkerPoolManager {
	
	private static WorkerPoolManager manager = new WorkerPoolManager();



    private ExecutorService syncExecutor;
	private ExecutorService asyncExecutor;
	private ExecutorService kaka;

	
	private WorkerPoolManager() {

		asyncExecutor =new ThreadPoolExecutor(2,5,10, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(200),new KakaNameThreadFactory("kaka-asyn"));

        syncExecutor =new ThreadPoolExecutor(2,5,10, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(200),new KakaNameThreadFactory("kaka-syn"));

		kaka =new ThreadPoolExecutor(2,5,10, TimeUnit.SECONDS,
				new LinkedBlockingQueue<Runnable>(200),new KakaNameThreadFactory("kaka-own"));
	}
	
	public static WorkerPoolManager getInstance() {
		return manager;
	}
	

	
	public ExecutorService getAsyncExecutor() {
		return asyncExecutor;
	}
	


    public ExecutorService getSyncExecutor() {
        return syncExecutor;
    }


	public ExecutorService getKaka() {
		return kaka;
	}

	public void setKaka(ExecutorService kaka) {
		this.kaka = kaka;
	}
}


