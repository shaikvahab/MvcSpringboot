<%@page language="java" %>
<html xmlns:th="http://www.thymeleaf.org">
    <head>
        <link rel="stylesheet" type="text/css" href="Style.css">
    </head>
    </body>
        <h2>The data is:-</h2>
        <h2 th:text = "${alien}"> ${alien}</h2>
    </body>
</html>