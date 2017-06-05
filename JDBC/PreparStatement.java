import java.sql.*;

public class PreparStatement {

    public void insertPrepared(String name,int age) {

        DatabaseConnection dc=new DatabaseConnection();
        Connection conn=dc.getConnection();
        java.sql.PreparedStatement ps=null;
        String sql="insert into china11(name,age) values(?,?)";
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1,name);
            ps.setInt(2,age);
            ps.executeUpdate();

            ps.close();
        }

        catch(SQLException e) {

        }

        finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch(SQLException e) {}



            }


        }



    }
    public static void main(String[] args) {
        PreparStatement pp=new PreparStatement();
        pp.insertPrepared("xiaob",10);


    }



}