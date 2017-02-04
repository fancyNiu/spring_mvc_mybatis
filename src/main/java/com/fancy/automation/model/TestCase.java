package com.fancy.automation.model;

/**
 * Created by puhui on 2017/2/4.
 */
public class TestCase {

    /**测试用例编号*/
    private int id;
    /**测试接口*/
    private String url;
    /**接口类型*/
    private String method;
    /**测试用例标题*/
    private String name;
    /**接口auth认证*/
    private String auth;
    /**输入*/
    private String input;
    /**预期输出*/
    private String expect;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getExpect() {
        return expect;
    }

    public void setExpect(String expect) {
        this.expect = expect;
    }

    @Override
    public String toString() {
        return "TestCase{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", name='" + name + '\'' +
                ", auth='" + auth + '\'' +
                ", input='" + input + '\'' +
                ", expect='" + expect + '\'' +
                '}';
    }
}
