import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;

public class jdbc extends HttpServlet{
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
try{
PrintWriter out=res.getWriter();
String url="jdbc:mysql://localhost:3306/mahek";
String uname="root";
String pass="Sumo@123";
String nm="arpit";
int ps=234;
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection(url,uname,pass);
PreparedStatement st=con.prepareStatement("insert into login values(?,?)");
st.setString(1,nm);
st.setInt(2,ps);
//ResultSet rs=
st.executeUpdate();
/*while(rs.next()){
out.println(rs.getString(1)+" "+rs.getInt(2));*/
con.close();
}
catch(Exception e){}
}//end of doGet()
}//end of class
