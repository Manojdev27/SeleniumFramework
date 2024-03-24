package com.facebook.testdata;



import io.github.sskorol.data.Column;

public class TestData {

    @Column(name = "testcase")
    public String testCaseName;
    @Column(name ="username")
    public String username;
    @Column(name ="password")
    public String password;
//    @Column(name ="age", index = 3, converterClass = IntegerConverter.class)
//    public int age;

    @Column(name = "expected")
    public String expectedTitle;
}
