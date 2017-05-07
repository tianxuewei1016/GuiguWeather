package xuewei.atguigu.app.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 作者：田学伟 on 2017/5/7 11:04
 * QQ：93226539
 * 作用：
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
