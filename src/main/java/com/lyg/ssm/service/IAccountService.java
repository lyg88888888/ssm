package com.lyg.ssm.service;

public interface IAccountService {


    /**
     * 转账业务
     * @param source
     * @param targer
     * @param money
     */
    void transfer(int source,int targer, double money);
}
