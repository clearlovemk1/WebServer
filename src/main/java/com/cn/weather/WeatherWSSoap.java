
package com.cn.weather;

import com.cn.weather.ArrayOfString;
import com.cn.weather.GetRegionDatasetResponse;
import com.cn.weather.GetSupportCityDatasetResponse;
import com.cn.weather.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherWSSoap", targetNamespace = "http://WebXml.com.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherWSSoap {


    /**
     * <br /><h3>获得中国省份、直辖市、地区；国家名称（国外）和与之对应的ID</h3><p>输入参数：无，返回数据：DataSet。</p><br />
     * 
     * @return
     *     returns com.cn.weather.GetRegionDatasetResponse.GetRegionDatasetResult
     */
    @WebMethod(action = "http://WebXml.com.cn/getRegionDataset")
    @WebResult(name = "getRegionDatasetResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getRegionDataset", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.weather.GetRegionDataset")
    @ResponseWrapper(localName = "getRegionDatasetResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.weather.GetRegionDatasetResponse")
    public GetRegionDatasetResponse.GetRegionDatasetResult getRegionDataset();

    /**
     * <br /><h3>获得中国省份、直辖市、地区和与之对应的ID</h3><p>输入参数：无，返回数据：一维字符串数组。</p><br />
     * 
     * @return
     *     returns com.cn.weather.ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getRegionProvince")
    @WebResult(name = "getRegionProvinceResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getRegionProvince", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.weather.GetRegionProvince")
    @ResponseWrapper(localName = "getRegionProvinceResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.weather.GetRegionProvinceResponse")
    public ArrayOfString getRegionProvince();

    /**
     * <br /><h3>获得国外国家名称和与之对应的ID</h3><p>输入参数：无，返回数据：一维字符串数组。</p><br />
     * 
     * @return
     *     returns com.cn.weather.ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getRegionCountry")
    @WebResult(name = "getRegionCountryResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getRegionCountry", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.weather.GetRegionCountry")
    @ResponseWrapper(localName = "getRegionCountryResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.weather.GetRegionCountryResponse")
    public ArrayOfString getRegionCountry();

    /**
     * <br /><h3>获得支持的城市/地区名称和与之对应的ID</h3><p>输入参数：theRegionCode = 省市、国家ID或名称，返回数据：DataSet。</p><br />
     * 
     * @param theRegionCode
     * @return
     *     returns com.cn.weather.GetSupportCityDatasetResponse.GetSupportCityDatasetResult
     */
    @WebMethod(action = "http://WebXml.com.cn/getSupportCityDataset")
    @WebResult(name = "getSupportCityDatasetResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getSupportCityDataset", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.weather.GetSupportCityDataset")
    @ResponseWrapper(localName = "getSupportCityDatasetResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.weather.GetSupportCityDatasetResponse")
    public GetSupportCityDatasetResponse.GetSupportCityDatasetResult getSupportCityDataset(
        @WebParam(name = "theRegionCode", targetNamespace = "http://WebXml.com.cn/")
        String theRegionCode);

    /**
     * <br /><h3>获得支持的城市/地区名称和与之对应的ID</h3><p>输入参数：theRegionCode = 省市、国家ID或名称，返回数据：一维字符串数组。</p><br />
     * 
     * @param theRegionCode
     * @return
     *     returns com.cn.weather.ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getSupportCityString")
    @WebResult(name = "getSupportCityStringResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getSupportCityString", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.weather.GetSupportCityString")
    @ResponseWrapper(localName = "getSupportCityStringResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.weather.GetSupportCityStringResponse")
    public ArrayOfString getSupportCityString(
        @WebParam(name = "theRegionCode", targetNamespace = "http://WebXml.com.cn/")
        String theRegionCode);

    /**
     * <br /><h3>获得天气预报数据</h3><p>输入参数：城市/地区ID或名称，返回数据：一维字符串数组。</p><br />
     * 
     * @param theUserID
     * @param theCityCode
     * @return
     *     returns com.cn.weather.ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getWeather")
    @WebResult(name = "getWeatherResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getWeather", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.weather.GetWeather")
    @ResponseWrapper(localName = "getWeatherResponse", targetNamespace = "http://WebXml.com.cn/", className = "com.cn.weather.GetWeatherResponse")
    public ArrayOfString getWeather(
        @WebParam(name = "theCityCode", targetNamespace = "http://WebXml.com.cn/")
        String theCityCode,
        @WebParam(name = "theUserID", targetNamespace = "http://WebXml.com.cn/")
        String theUserID);

}
