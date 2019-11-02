<%--
  Created by IntelliJ IDEA.
  User: tuanlq
  Date: 01/11/2019
  Time: 22:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
  <title>Simple Dictionary</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<%--<form  action="/translate" method="post">--%>
<form  action="/calculate" method="post">
  <table>
    <tr>
      <td>Product Description</td>
      <td><input type="text" name="txtProductDescription"></td>
    </tr>
    <tr>
      <td>List Price</td>
      <td><input type="text" name="numberListPrice"></td>
    </tr>
    <tr>
      <td>Discount Percent</td>
      <td><input type="text" name="numberDiscountPercent"></td>
      <td>(%)</td>
    </tr>
    <tr>
      <td><input type = "submit" id = "submit" value = "Calculate Discount"/></td>
    </tr>
  </table>
</form>
</body>
</html>
