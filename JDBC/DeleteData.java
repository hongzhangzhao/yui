import java.sql.*;

public class DeleteData {

    public void deleteData(int id) {
        String sql="delete from china11 where id="+id+"";
        DatabaseConnection dac=new DatabaseConnection();
        Connection conn=dac.getConnection();
        Statement st=null;

        try {
            st=conn.createStatement();
            st.executeUpdate(sql);
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
        DeleteData dd=new DeleteData();
        dd.deleteData(1);

    }



}