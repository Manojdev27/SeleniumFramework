package com.facebook.tests;

import com.facebook.testdata.TestData;
import com.facebook.utils.DataProviderUtils;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataSupplierTest {

    @DataSupplier(runInParallel = true)
    public StreamEx<TestData> getData(Method method) {
        return TestDataReader.use(XlsxReader.class)
                .withTarget(TestData.class)
                .withSource("testdata.xlsx")
                .read()
                .filter(testData -> testData.testCaseName.equalsIgnoreCase(method.getName()));
    }

    @Test(dataProvider = "getData")
    public void dataSupplierTest(TestData testData){

        System.out.println(testData.username);
    }

}
