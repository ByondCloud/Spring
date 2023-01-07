package com.cloud.service.impl;

import com.cloud.mapper.AccountMapper;
import com.cloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/4
 * @Time 7:29
 */
@Service("AccountService")
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public void transferMoney(String outAccount, String inAccount, Integer money) {
        accountMapper.decrMoney(outAccount, money);
        int i = 1 / 0;
        accountMapper.incrMoney(inAccount, money);
    }

    @Override
    public void registerAccount() {
        System.out.println("注册");
    }


}
