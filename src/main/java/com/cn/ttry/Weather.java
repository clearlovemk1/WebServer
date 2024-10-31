package com.cn.ttry;

import com.cn.weather.ArrayOfString;
import com.cn.weather.WeatherWS;
import com.cn.weather.WeatherWSSoap;

import java.util.List;
import java.util.ArrayList;



public class Weather {

    /**
     * 获取城市信息
     *
     * @param cityname 城市名
     * @return 返回天气信息的列表
     */
    public List<String> getWeather(String cityname) {
        // 创建实例化对象
        WeatherWS weatherWS = new WeatherWS();
        // 通过实例化对象创建接口
        WeatherWSSoap weatherWSSoap = weatherWS.getWeatherWSSoap();
        // 通过接口传入城市名获取天气信息
        ArrayOfString weather = weatherWSSoap.getWeather(cityname, null);

        List<String> weatherInfo = new ArrayList<>();
        if (weather != null) {
            // 将获取到的信息转成集合
            weatherInfo = weather.getString();
        } else {
            weatherInfo.add("未找到天气信息。");
        }
        for (String s : weatherInfo) {
            System.out.println("s: " + s);
            System.out.println("-----------");
        }
        return weatherInfo;
    }
}
