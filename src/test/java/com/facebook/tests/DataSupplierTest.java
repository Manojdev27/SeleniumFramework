package com.facebook.tests;

import com.facebook.testdata.TestData;
import org.testng.annotations.Test;

public class DataSupplierTest {

    @Test(dataProvider = "getData")
    public void dataSupplierTest(TestData testData){

        System.out.println(testData.username);
    }

}
