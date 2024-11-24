package tracking;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class App extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Asset Tracking System</h1>");
        out.println("<p>Welcome to the Asset Tracking System</p>");
    }
}

