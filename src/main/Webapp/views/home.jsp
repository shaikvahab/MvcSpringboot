
<%@page language="java" %>
<html >
    <head>
        <link rel="stylesheet" type="text/css" href="Style.css">
    </head>
    </body>
        <h2> Data and  Calculator </h2>

         <form action="addAlien">
                <label for="aid">Enter Id :</label>
                <input type="text" id="aid" name="aid"><br>
                <label for="aname">Enter name:</label>
                <input type="text" id="aname" name="aname"><br>
                <input type="submit" value="Submit">
            </form>

            <form action="add">
                <label for="num1">Enter num1 :</label>
                <input type="text" id="num1" name="num1"><br>
                <label for="num2">Enter num2:</label>
                <input type="text" id="num2" name="num2"><br>
                <input type="submit" value="Submit">
            </form>

    </body>
</html>