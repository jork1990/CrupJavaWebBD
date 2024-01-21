

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Formulario Web BD</title>
        
    </head>
    <body>
        <h1>Datos del usuario</h1>
        
 <form action="SvUsuarios" method="POST">
            
              <p><label> Nombres      :   </label> <input type= "text" name = "Nombres"     ></p>
              <p><label> Apellidos    :   </label> <input type= "text" name = "Apellidos"   ></p>
              <p><label> Documento    :   </label> <input type= "text" name = "Documento"   ></p>
              <p><label> Email        :   </label> <input type= "text" name = "Email"       ></p>
              <p><label> Telefono     :   </label> <input type= "text" name = "Telefono"    ></p>
              <p><label> Sexo         :   </label> <input type= "text" name = "Sexo"        ></p>
              <p><label> Fnacimiento  :   </label> <input type= "text" name = "Fnacimiento" ></p>
              <button type="submit">Enviar</button>

        </form>
              <h1>Lista Clientes</h1>
              <p>Dar click en este Boton para ver la lista de Clientes</p>
              <form action="SvUsuarios"method="GET">
                  
              <button type="submit"> mostrar Lista </button>
        </form>
        
    </body>
</html>