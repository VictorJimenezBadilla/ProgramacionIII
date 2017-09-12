<%-- 
    Document   : Salarios
    Created on : 09/09/2017, 11:05:30 AM
    Author     : Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <title>Lista de Salarios</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="Fondo.css"/>
       <%! int policia,bombero,abogado,futbolista,repartidor;%>
    </head>
    <body>
        <h1>Lista de Salarios por trabajos</h1>
        <%
         policia = Integer.parseInt(request.getParameter("pol"));
         bombero = Integer.parseInt(request.getParameter("bom"));
         abogado = Integer.parseInt(request.getParameter("abo"));
         futbolista = Integer.parseInt(request.getParameter("fut"));
         repartidor = Integer.parseInt(request.getParameter("rep"));
        %>
        
         <h2> El salario de un Policia es: <%=policia%> Colones</h2>
         <h2> El salario de un Bombero es: <%=bombero%> Colones</h2>
         <h2> El salario de un Abogado es: <%=abogado%> Colones</h2>
         <h2> El salario de un Futbolista es: <%=futbolista%> Colones</h2>
         <h2> El salario de un Repartidor es: <%=repartidor%> Colones</h2>

         <form action="index.html">
     <td><input type="submit"   
                           value="Guardar">
         </form>
    
    </body>
</html>
