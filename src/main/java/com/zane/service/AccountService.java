package com.zane.service;

import com.zane.entity.Account;

public interface AccountService {
    public Account findByUsername(String username);
}