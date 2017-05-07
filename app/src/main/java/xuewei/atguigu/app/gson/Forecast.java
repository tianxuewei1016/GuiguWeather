package xuewei.atguigu.app.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：田学伟 on 2017/5/7 11:11
 * QQ：93226539
 * 作用：
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;

    }

}
