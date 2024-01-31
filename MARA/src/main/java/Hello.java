import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Hello {
	static String dbUrl="jdbc:mysql://localhost:3306/ngpdb";
    static String dbUname="root";
    static String dbPassword="";
    static String dbDriver="com.mysql.cj.jdbc.Driver";
	String name,pass,email,number;
	Hello(String name,String pass,String email,String number){
		this.name=name;
		this.pass=pass;
		this.email=email;
		this.number=number;
	}

	void store() {
		// TODO Auto-generated method stub
		Connection con = null;
   		try {
   			Class.forName(dbDriver);  //class not found exception
			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
			
			String sql = "insert into student_table (name,password,email,phn_no)"
					+ "values('"+name+"','"+pass+"','"+email+"','"+number+"')";
 		   
			Statement s = con.createStatement();
		
		   	s.execute(sql);
		   
		   	con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
