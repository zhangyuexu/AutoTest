package com.zyx.httpclient.demo;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

public class MyHttpClient {

    @Test
    public void test1() throws Exception{
        String result;

        HttpGet httpGet = new HttpGet("http://www.baidu.com");

        HttpClient httpClient = new DefaultHttpClient();

        HttpResponse httpResponse = httpClient.execute(httpGet);

        HttpEntity httpEntity = httpResponse.getEntity();

        result = EntityUtils.toString(httpEntity,"utf-8");

        System.out.println(result);

    }
}
