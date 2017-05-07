package xuewei.atguigu.app.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * 作者：田学伟 on 2017/5/7 13:06
 * QQ：93226539
 * 作用：
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
