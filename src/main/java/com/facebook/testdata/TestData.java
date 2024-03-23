package com.facebook.testdata;


import com.creditdatamw.zerocell.annotation.Column;
import com.creditdatamw.zerocell.converter.IntegerConverter;

public class TestData {


    @Column(name ="testcase", index = 0)
    public String testCaseName;
    @Column(name ="username", index = 1)
    public String username;
    @Column(name ="password", index = 2)
    public String password;
//    @Column(name ="age", index = 3, converterClass = IntegerConverter.class)
//    public int age;

    @Column(name = "expected", index = 3)
    public String expectedTitle;
}
