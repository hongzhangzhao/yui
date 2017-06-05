import java.sql.*;

public class InsertDatabase {


    public void insertByStatement(String name,int age) {

        String sql="insert into china11(name,age) values(\""+name+"\","+age+")";
        System.out.println(sql);
        DatabaseConnection id=new DatabaseConnection();
        Connection conn=id.getConnection();
        Statement stmt=null;
        try {

            stmt=conn.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
        } catch(SQLException e) {}
        finally {
            try{
                conn.close();
            } catch(SQLException e) {}
        }

    }
    public static void main(String[] args) {
        InsertDatabase insert=new InsertDatabase();
        insert.insertByStatement("yi",1);


    }

}