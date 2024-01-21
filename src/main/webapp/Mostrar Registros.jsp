

<%@page import="logica.Usuarios"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>Mostrar Usuarios</title>
    </head>
    <body>
        <h1>Lista De Registros</h1>
        <%
           List<Usuarios> listaUsuarios  = (List) request.getSession().getAttribute("listaUsuarios");
           int cont = 1;
           for(Usuarios usu : listaUsuarios){
        %>
          <p><b>Cliente Nº<%=cont%></b></p>
          <p>Nombres       : <%=usu.getNombres()%> </p>
          <p>Apellidos     : <%=usu.getApellidos()%> </p>
          <p>Documento    : <%=usu.getDocumento()%> </p>
          <p>Email       : <%=usu.getEmail()%> </p>
          <p>Telefono   : <%=usu.getTelefono()%> </p>
          <p>Sexo          : <%=usu.getSexo()%> </p>
          <p>FechaNac   : <%=usu.getFechaNac()%> </p>
          
          <%cont = cont + 1;%>
        
         <%}%>
    </body>
</html>