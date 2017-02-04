package com.fancy.automation.dao;

import com.fancy.automation.model.TestCase;

/**
 * Created by puhui on 2017/2/4.
 */
public interface TestCaseDao {

    /**获取测试用例*/
    public TestCase getTestCase(TestCase testCase);

    /**添加测试用例*/
    public void addTestCase(TestCase testCase);

    /**更新测试用例*/
    public TestCase updateTestCase(TestCase testCase);

    /**删除测试用例*/
    public TestCase deleteTestCase(TestCase testCase);


}
