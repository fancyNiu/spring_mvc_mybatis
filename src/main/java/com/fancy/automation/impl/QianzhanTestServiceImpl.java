package com.fancy.automation.impl;

import com.fancy.automation.mapper.TestCaseMapper;
import com.fancy.automation.model.Result;

import javax.annotation.Resource;

/**
 * Created by puhui on 2017/2/6.
 */
public class QianzhanTestServiceImpl {

    @Resource
    private TestCaseMapper testCaseMapper;

    @Override
    public Result run(String username, String password) {
        return um.login(username, password);
    }


}
