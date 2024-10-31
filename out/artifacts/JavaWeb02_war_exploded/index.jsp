<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>天气查询系统</title>
</head>
<body>
<h2>天气查询系统</h2>
<form action="weather" method="post">
  <label for="city">请输入城市名称：</label>
  <input type="text" id="city" name="city" required>
  <button type="submit">查询天气</button>
</form>

<h3>查询结果：</h3>
<p>${weatherResult}</p>
</body>
</html>
