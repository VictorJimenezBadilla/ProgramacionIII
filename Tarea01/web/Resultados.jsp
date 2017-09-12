<%-- 
    Document   : Resultados
    Created on : 09/09/2017, 09:53:20 AM
    Author     : Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Datos del Trabajador </title>    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="Fondo.css"/>

        <%! String nombre, apellido, oficio;
            int salario;%>

    </head>
    
    <body>
        <h1>Datos del trabajador</h1>
        <%
         nombre = request.getParameter("nom");
         apellido = request.getParameter("ape");
         oficio = request.getParameter("ofi");
         salario = Integer.parseInt(request.getParameter("sal"));
        %>
        <br>

        <!--Para mostrar las variables-->
        <h2> Bienvenido al sistema para trabajadores, <%=nombre%></h2>        
        <h2> <%=nombre%> Tu apellido es:<%=apellido%></h2>
        <h2> Tu puesto de trabajo es:<%=oficio%></h2>
        <h2> Tu salario actual es:<%=salario%></h2>
        
   <form action="index.html">
     <td><input type="submit"   
                           value="Regresar">
         </td></tr>
   
         </form>
        
           <form action="AgregarSalarios1.jsp">
     <td><input type="submit"   
                           value="Siguiente">
         </td></tr>
         </form>
        


</body>
</html>
