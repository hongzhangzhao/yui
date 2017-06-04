import java.sql.*;

public class DatabaseConnection {

    String driver="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/dataName?characterEncoding=utf8&useSSL=true";
    String user="?";
    String password="?";

    public Connection getConnection() {
        Connection conn=null;

        try {
            Class.forName(driver);
            conn=DriverManager.getConnection(url,user,password);

        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        } catch(SQLException e) {
            e.printStackTrace();
        }

        return conn;


    }

public static void main(String[] args) throws SQLException {
	
	DatabaseConnection dc=new DatabaseConnection();
	Connection cc=dc.getConnection();
	System.out.println(cc);
	cc.close();
	
}


}