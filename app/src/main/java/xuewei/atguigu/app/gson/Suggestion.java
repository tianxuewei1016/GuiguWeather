package xuewei.atguigu.app.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 作者：田学伟 on 2017/5/7 11:10
 * QQ：93226539
 * 作用：
 */

public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

}
