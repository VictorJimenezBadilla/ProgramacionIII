<%-- 
    Document   : AgregarSalarios1
    Created on : 09/09/2017, 12:04:00 PM
    Author     : Pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Fondo.css"/>
        <title>Agregando Salarios</title>

    </head>
    <body>
        <h1>Agrege los Salarios para cada trabajo</h1>
        <form action="Salarios.jsp">
            <table border="5">

                <tr><td>Policia </td>
                    <td><input type="text"
                               id="pol" name="pol">
                    </td></tr>

                <tr><td>Bombero </td>
                    <td><input type="text"
                               id="bom" name="bom">
                    </td></tr>

                <tr><td>Abogado </td>
                    <td><input type="text"
                               id="abo" name="abo">
                    </td></tr>

                <tr><td>Futbolista </td>
                    <td><input type="text"
                               id="fut" name="fut">
                    </td></tr>

                <tr><td>Repartidor </td>
                    <td><input type="text"
                               id="rep" name="rep">
                    </td></tr>


                <td><input type="submit"   
                           value="Guardar"> <!--Se crea un boton, que se llama enviar,con cajita-->

                    

            </table>
        </form>

        <form action="index.html"> 
            <td><input type="submit"   
                           value="Volver al inicio"> 
                
            </form>
    </body>
</html>
