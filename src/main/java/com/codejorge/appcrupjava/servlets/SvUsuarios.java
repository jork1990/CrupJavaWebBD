
package com.codejorge.appcrupjava.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Usuarios;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

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
        listaUsuarios.add(new Usuarios("luis camilo","castañeda ojeda","1234","dshfkhf@hjhasjyd","3456676","Masculino","931987"));
        listaUsuarios.add(new Usuarios("luisa camila","castaño ojeda","12345","dshfkhf@hjhasjyd","3456676","Femenino","1931996"));
        listaUsuarios.add(new Usuarios("carlos andres","cifuentes camacho","123456","dshfkhf@hjhasjyd","3456676","Masculino","871990"));
        listaUsuarios.add(new Usuarios("Daniel camilo","Avendaño Cervantes","1234567","dshfkhf@hjhasjyd","3456676","Masculino","791989"));
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
     
     System.out.println("Nombre es : "+ Nombres );
     System.out.println("Apellidos es : "+ Apellidos );
     System.out.println("Documento es : "+ Documento );
     System.out.println("Email es : "+ Email );
     System.out.println("Telefono  es : "+ Telefono );
     System.out.println("Sexo es : "+ Sexo );
     System.out.println("Fechanac es : "+ Fechanac  );
        
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
