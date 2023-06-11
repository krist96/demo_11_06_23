<%--
  Created by IntelliJ IDEA.
  User: 48518
  Date: 11.06.2023
  Time: 12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form method="post" action="Kalkulator">
      <label for="liczba"></label>
      <input type="text" name="liczba" id="liczba">
      <label for="liczba2"></label>
      <input type="text" name="liczba2" id="liczba2">
      <input type="submit" value="Oblicz">
    </form>
    <div> <%= request.getAttribute("wynik") != null ?
            request.getAttribute("wynik") : "" %> </div>

</body>
</html>
