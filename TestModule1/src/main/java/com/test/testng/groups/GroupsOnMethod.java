package com.test.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端的测试方法1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端的测试方法2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端的测试方法3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端的测试方法4");
    }

    @BeforeGroups("server")
    public void beforeGroupOnServer(){
        System.out.println("这是服务端组运行之前运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupOnServer(){
        System.out.println("这是服务端组运行之后运行的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupOnClient(){
        System.out.println("这是客户端组运行之前运行的方法");
    }
    @AfterGroups("client")
    public void afterGroupOnClient(){
        System.out.println("这是客户端组运行之后运行的方法");
    }
}
