import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class jdbc extends HttpServlet{
public void doPost(HttpServletRequest req, HttpServletResponse res){
try{
PrintWriter out=res.getWriter();
String url="jdbc:mysql://localhost:3306/mahek";
String uname="root";
String pass="Sumo@123";
Class.forName("com.mysql.jdbc.Driver");
String nm=req.getParameter("nm");
String ps=req.getParameter("ps");
Connection con =DriverManager.getConnection(url,uname,pass);
PreparedStatement st=con.prepareStatement("insert into login values(?,?)");
st.setString(1,nm);
st.setString(2,ps);
st.executeUpdate();
res.sendRedirect("http://localhost:9090/mahek/display");
}
catch(Exception e){}
}//end of doPost()
}//end of class
