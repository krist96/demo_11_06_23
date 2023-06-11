<%--
  Created by IntelliJ IDEA.
  User: 48518
  Date: 11.06.2023
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <form method="post" action="Formularz">
    <label for="imie">Imię: </label>
    <input id="imie" type="text" name="imie">
    <label for="nazwisko">Nazwisko: </label>
    <input id="nazwisko" type="text" name="nazwisko">

    <input type="submit" value="Prześlij!">
  </form>
  <div style="color: <%= request.getAttribute("kolorImie")%>;">
    <%= "Imie: " + request.getAttribute("weryfikacjaImie") %>
  </div>
  <div style="color: <%= request.getAttribute("kolorNazwisko")%>;">
    <%=  "Nazwisko: " + request.getAttribute("weryfikacjaNazwisko")%>
  </div>
</body>
</html>
