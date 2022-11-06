import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse response) throws
ServletException, IOException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
String username=request.getParameter("uname");
String password=request.getParameter("pw");
String msg="";
if (username .equals("admin") && password.equals("admin123"))
msg="Hello "+username;
else
msg="Login failed";
out.println("<b>"+msg+"<b>");
}
}