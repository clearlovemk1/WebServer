package com.cn.ttry;

import com.cn.weather.ArrayOfString;
import com.cn.weather.WeatherWS;
import com.cn.weather.WeatherWSSoap;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

@WebServlet("/weather")
public class WeatherServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String city = request.getParameter("city");


        // 使用 Weather 类获取天气信息
        Weather weather = new Weather();
        List<String> weatherInfo = weather.getWeather(city);

        // 设置响应内容
        response.setContentType("application/json; charset=UTF-8");
        PrintWriter out = response.getWriter();

        if (weatherInfo.isEmpty()) {
            out.println("[\"查询结果为空。http://www.webxml.com.cn/\"]");
        } else {
            String jsonResponse = new Gson().toJson(weatherInfo);
            out.println(jsonResponse);
        }
    }
}






