import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {
	static String dbUrl="jdbc:mysql://localhost:3306/ngpdb";
    static String dbUname="root";
    static String dbPassword="";
    static String dbDriver="com.mysql.cj.jdbc.Driver";
	String name,password;
	Login(String name,String password){
		this.name=name;
		this.password=password;
		
		
	}
	
	
	boolean compare() {
        Connection con = null;
        try {
            Class.forName(dbDriver);
            con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
            String sql = "select * from student_table where name='" + name + "' AND password='" + password + "'";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);

            return rs.next(); // Return true if login is successful, false otherwise
        } catch (Exception e) {
            e.printStackTrace();
            return false; // Return false in case of any exception
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}






//
//import java.sql.*;
//
//public class Login {
//    String dbUrl = "jdbc:mysql://localhost:3306/ngpdb";
//    String dbUname = "root";
//    String dbPassword = "";
//    String dbDriver = "com.mysql.cj.jdbc.Driver";
//    String name, password;
//
//    Login(String name, String password) {
//        this.name = name;
//        this.password = password;
//    }
//
//    boolean compare() {
//        Connection con = null;
//        try {
//            Class.forName(dbDriver);
//            con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
//            String sql = "select * from student_db where name='" + name + "' AND password='" + password + "'";
//            Statement s = con.createStatement();
//            ResultSet rs = s.executeQuery(sql);
//
//            return rs.next(); // Return true if login is successful, false otherwise
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false; // Return false in case of any exception
//        } finally {
//            try {
//                if (con != null) {
//                    con.close();
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}


