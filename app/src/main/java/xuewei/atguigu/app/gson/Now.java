package xuewei.atguigu.app.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：田学伟 on 2017/5/7 11:10
 * QQ：93226539
 * 作用：
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
