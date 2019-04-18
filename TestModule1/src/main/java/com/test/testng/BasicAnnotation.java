package com.test.testng;

import org.testng.annotations.*;

//testng注解标签，用来把方法标记为测试的一部分
public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("Test这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("Test这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类运行之前运行");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类运行之后运行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
}
