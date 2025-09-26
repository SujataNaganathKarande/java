package JDBC;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class oracleconnection {
public static void main(String [] args) throws Exception {
//load the JDBC driver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//connection object
	Connection Con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:orcl","System","password");
	//JDBC object for statement
Statement st=Con.createStatement();
//write the query
String query="select*from employee";
//create JDBC RsultSet object
ResultSet rs=st.executeQuery(query);
while(rs.next()){
	System.out.println(rs.getInt(1)+""+rs.getString(2));
}
rs.close();
st.close();
Con.close();
}
}
	