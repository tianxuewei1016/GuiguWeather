package xuewei.atguigu.app.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：田学伟 on 2017/5/7 11:05
 * QQ：93226539
 * 作用：
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
