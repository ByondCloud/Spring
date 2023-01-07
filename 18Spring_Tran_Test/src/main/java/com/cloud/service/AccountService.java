package com.cloud.service;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/4
 * @Time 7:27
 */
public interface AccountService {

    void transferMoney(String outAccount, String inAccount, Integer money);

    void registerAccount();

}
