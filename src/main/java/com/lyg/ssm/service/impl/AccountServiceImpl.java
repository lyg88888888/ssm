package com.lyg.ssm.service.impl;

import com.lyg.ssm.domain.Account;
import com.lyg.ssm.mapper.IAccountMapper;
import com.lyg.ssm.service.IAccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Resource
    private IAccountMapper accountMapper;

    @Transactional
    @Override
    public void transfer(int source, int targer, double money) {

        // 1.判断用户有效性
        if (accountMapper.findById(source) != null && accountMapper.findById(targer) !=null){

            // 转账
            Account sourceAccount = accountMapper.findById(source);

            Account targerAccount = accountMapper.findById(targer);

            sourceAccount.setMoney(sourceAccount.getMoney()-1000.0);
            accountMapper.update(sourceAccount);
            //int i = 1 / 0;
            targerAccount.setMoney(targerAccount.getMoney()+1000.0);
            accountMapper.update(targerAccount);

        }
    }
}
