package com.dds.http.urlconn;



import com.dds.basehttp.HttpRequest;
import com.dds.basehttp.ICallback;

import java.io.InputStream;
import java.util.Map;

/**
 * Created by dds on 2019/12/20.
 * android_shuai@163.com
 */
public class UrlConnRequest implements HttpRequest {


    public UrlConnRequest() {
    }

    @Override
    public void get(String url, Map<String, String> params, ICallback callback) {

    }

    @Override
    public void post(String url, Map<String, String> params, ICallback callback) {

    }

    @Override
    public void initCertificate(InputStream certificate, String pwd) {

    }
}
