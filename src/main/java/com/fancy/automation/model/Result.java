package com.fancy.automation.model;

import java.util.Date;

/**
 * Created by puhui on 2017/2/4.
 */
public class Result {

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
    /**实际输出*/
    private String actual;
    /**执行日期*/
    private Date data;
    /**执行结果*/
    private Boolean result;

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

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", name='" + name + '\'' +
                ", auth='" + auth + '\'' +
                ", input='" + input + '\'' +
                ", expect='" + expect + '\'' +
                ", actual='" + actual + '\'' +
                ", data=" + data +
                ", result=" + result +
                '}';
    }
}
