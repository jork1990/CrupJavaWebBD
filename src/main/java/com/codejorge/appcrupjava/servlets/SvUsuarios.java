
package com.codejorge.appcrupjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Usuarios;
import static logica.Usuarios_.FechaNac;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
    Controladora control = new  Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvUsuarios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvUsuarios at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             List<Usuarios>listaUsuarios= new ArrayList<>();
             listaUsuarios = control.traerUsuarios();
       
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaUsuarios",listaUsuarios);
        response.sendRedirect("Mostrar Registros.jsp");
        
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String Nombres = request.getParameter("Nombres");
     String Apellidos = request.getParameter("Apellidos");
     String Documento = request.getParameter("Documento");
     String Email = request.getParameter("Email");
     String Telefono = request.getParameter("Telefono");
     String Sexo = request.getParameter("Sexo");
     String Fechanac = request.getParameter("Fechanac");
     
     Usuarios usu  = new Usuarios();
     usu.setNombres(Nombres);
     usu .setApellidos(Apellidos);
     usu.setDocumento(Documento);
     usu .setEmail(Email);
     usu.setTelefono(Telefono);
     usu .setSexo(Sexo);
     usu .setFechaNac((Date) FechaNac);
     
     control.crearUsuarios(usu);
        
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
