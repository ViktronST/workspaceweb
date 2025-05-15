<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Calculadora JSP</title>
</head>
<body>

    <form action="calculadora" method="GET">
        Numero1: <input type="number" name="num1" id="num1">
        Numero2: <input type="number" name="num2" id="num2">
        <select name="operacion">
            <option value="suma">Sumar</option>
            <option value="resta">Restar</option>
            <option value="multiplica">Multiplicar</option>
            <option value="divide">Dividir</option>
        </select>
        <input type="submit" value="Enviar">
    </form>
    
    <%
        String resultadoStr = request.getParameter("resultado");
        if (resultadoStr != null) {
            try {
                int resultado = Integer.parseInt(resultadoStr);
    %>
                <p>Resultado: <%= resultado %></p>
    <%
            } catch (NumberFormatException e) {
    %>
                <p style="color:red;">Resultado no válido</p>
    <%
            }
        }
    %>

<%--   <%
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operacion = request.getParameter("operacion");

        if (num1Str != null && num2Str != null && operacion != null) {
	        int num1 = Integer.parseInt(num1Str);
	        int num2 = Integer.parseInt(num2Str);
	        int resultado = 0;
	        boolean error = false;
	
	        switch (operacion) {
	            case "suma": resultado = num1 + num2; break;
	            case "resta": resultado = num1 - num2; break;
	            case "multiplica": resultado = num1 * num2; break;
	            case "divide":
	                if (num2 != 0) {
	                    resultado = num1 / num2;
	                } else {
	                    out.println("<p>Error: No se puede dividir por cero.</p>");
	                    error = true;
	                }
	                break;
	            default: out.println("<p>Operación no válida.</p>"); error = true;
	        }
	
	        if (!error) {
	            out.println("<h3>Resultado: " + resultado + "</h3>");
	        }
        }
    %>  --%>
</body>
</html>