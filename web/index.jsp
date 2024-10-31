<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>天气查询系统</title>
  <script>
    function fetchWeather() {
      var city = document.getElementById("city").value;
      var xhr = new XMLHttpRequest();
      xhr.open("POST", "weather", true);
      xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
      xhr.onreadystatechange = function () {
        if (xhr.readyState == 4 && xhr.status == 200) {
          var weatherResult = JSON.parse(xhr.responseText);
          displayWeather(weatherResult);
        }
      };
      xhr.send("city=" + encodeURIComponent(city));
    }

    function displayWeather(weatherInfo) {
      var resultArea = document.getElementById("weatherResult");
      resultArea.innerHTML = ""; // 清空之前的结果

      // 显示天气信息
      for (var i = 0; i < weatherInfo.length; i++) {
        var p = document.createElement("p");
        p.textContent = weatherInfo[i];
        resultArea.appendChild(p);
      }
    }
  </script>
</head>
<body>
<h2>天气查询系统</h2>
<form onsubmit="event.preventDefault(); fetchWeather();">
  <label for="city">请输入城市名称：</label>
  <input type="text" id="city" name="city" required>
  <button type="submit">查询天气</button>
</form>

<h3>查询结果：</h3>
<div id="weatherResult"></div>
</body>
</html>
