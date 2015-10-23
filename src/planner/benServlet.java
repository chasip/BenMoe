package planner;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by chasip on 2015/10/23.
 */
public class benServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
  //  response.setContentType("text/plain");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.print("<h1>this is a servlet page</h1>");

    }
}
