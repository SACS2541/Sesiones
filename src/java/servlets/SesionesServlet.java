/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SesionesServlet extends HttpServlet {
   
     public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

         String nombre;
         String apellido;
        
      //recuperamos los datos del formulario
          nombre = request.getParameter("NOMBRE");
          apellido = request.getParameter("APELLIDO");
         
      

       response.setContentType("text/html");
      //Mostramos los  valores en el cliente
      PrintWriter out = response.getWriter();
       
    }
   

}
