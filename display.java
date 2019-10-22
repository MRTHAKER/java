import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;
public class display extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res){
try{
PrintWriter out=res.getWriter();
String url="jdbc:mysql://localhost:3306/mahek";
String uname="root";
String pass="Sumo@123";
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(url,uname,pass);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from login;");
while(rs.next()){
out.println(rs.getString(1)+"\n"+rs.getInt(2));}
con.close();
}
catch(Exception e){}
}
}
