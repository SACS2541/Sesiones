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


public class ValidaSesionesServlet extends HttpServlet {
   
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

      response.setContentType("text/html");
      String titulo = null;

      //Pedimos el atributo, y verificamos si existe
      String claveSesion = (String) request.getParameter("NOMBRE") + " " + request.getParameter("APELLIDO");

      if(claveSesion.equals("Sergio Alejandro")){
          HttpSession sesion = request.getSession();
          sesion.setAttribute("claveSesion", claveSesion);
          titulo = "<script>window.location = '/EjemploSession/home.jsp'</script>";
      }
      else
      {
        titulo = "<script>window.location = '/EjemploSession/Error.jsp'</script>";
      }


      //Mostramos los  valores en el cliente
      PrintWriter out = response.getWriter();
      out.println(titulo);;
  
    }

}
