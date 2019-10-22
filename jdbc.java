import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class jdbc extends HttpServlet{
public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
try{
PrintWriter out=res.getWriter();
String url="jdbc:mysql://localhost:3306/mahek";
String uname="root";
String pass="Sumo@123";
Class.forName("com.mysql.jdbc.Driver");
String nm=req.getParameter("nm");
int ps=Integer.parseInt(req.getParameter("ps"));
Connection con =DriverManager.getConnection(url,uname,pass);
PreparedStatement st=con.prepareStatement("insert into login values(?,?)");
st.setString(1,nm);
st.setInt(2,ps);
int k=st.executeUpdate();
con.close();
if(k>0){
res.sendRedirect("http://localhost:9090/mahek/display");
}
else{
out.println("error");}
}
catch(Exception e){}
}//end of doPost()
}//end of class
