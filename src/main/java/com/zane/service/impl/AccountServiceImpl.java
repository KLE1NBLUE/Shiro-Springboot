package com.zane.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zane.entity.Account;
import com.zane.mapper.AccountMapper;
import com.zane.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account findByUsername(String username) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username",username);
        return accountMapper.selectOne(wrapper);
    }
}
