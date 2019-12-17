package com.kaka.service;

/**
 * @author Lu.Gong
 * @date 12/2/2019
 */
public interface AsyncService {
    void noReturnTest() throws InterruptedException;

    void noReturnTestWithBeanName() throws InterruptedException;

    void noReturnTestForInt(int num) throws InterruptedException;

    void kakaTest() throws InterruptedException;
}
