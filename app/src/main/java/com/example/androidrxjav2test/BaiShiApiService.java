package com.example.androidrxjav2test;

import android.util.Log;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class BaiShiApiService {
    private static final String TAG = "BaiShiApiService";

    private final static String BASE_URL = "http://edi-q9.ns.800best.com/kd/api/process";
    private final static String PARTNER_ID = "66408";
    private final static String PARTNER_KEY = "nus8f1rq15n4";
    private final static String SERVICE_TYPE = "KD_TRACE_QUERY";

    public String getData(String orderId){
        MailNos value = new MailNos();
        value.mailNos = new MailNos.MailNosBean();
        value.mailNos.mailNo = Arrays.asList(orderId);
        Map<String, String> params = new HashMap<>();
        Param param = new Param();
        param.setPartnerID(PARTNER_ID);
        String jsonStr = new Gson().toJson(value);
        Log.e(TAG,"生成的请求的Json串---->"+jsonStr);
        param.setBizData(jsonStr);
        param.setServiceType(SERVICE_TYPE);
        param.setPartnerKey(PARTNER_KEY);



        FormBody.Builder builder = new FormBody.Builder();
        builder.add("partnerID", param.getPartnerID());
        builder.add("bizData", param.getBizData());
        builder.add("serviceType", param.getServiceType());
        builder.add("sign", Sign.makeSign(param));
        String result = null;
        try {
            Request request = new Request
                    .Builder()
                    .addHeader("Accept-Encoding", "application/json; charset=utf-8")
                    .addHeader("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8")
                    .post(builder.build())
                    .url(BASE_URL)
                    .build();
            // 执行请求，获取结果
            Response response = new OkHttpClient().newCall(request).execute();
            if (response.isSuccessful())
                result = response.body().string();
        } catch (Exception e) {
            Log.e(TAG,"请求失败了--->"+e.getMessage());
         }
        Log.e(TAG,"请求成功了--->"+result);

        return result;
    }


}
