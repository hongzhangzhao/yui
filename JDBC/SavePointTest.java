import java.sql.*;


public class SavePointTest {

    public void err () {

        DatabaseConnection dc=new DatabaseConnection();
        Connection conn=dc.getConnection();
        System.out.println(conn);
        Statement st=null;
        String sql1="insert into china11(id,name) values(15,'shiwu')";
        String sql2="insert into china11(id,name) values(16,'shiliu')";
        String sql3="select count(*) from china22 where name='diyi'";

        try {
            conn.setAutoCommit(false);
            st=conn.createStatement();

            st.executeUpdate(sql1);

            Savepoint sp=conn.setSavepoint("sp");

            st.executeUpdate(sql2);

            ResultSet rs=st.executeQuery(sql3);

            if(rs.next()) {
                int count=rs.getInt("count(*)");

                if(count <= 0) {

                    conn.rollback(sp);

                }


            }
            conn.commit();

        }


        catch(SQLException e) {
			System.out.println("Run sql error"+e.getMessage());
            try {
                conn.rollback();
            } catch(SQLException e1) {
                e1.getMessage();
            }
        }
        finally {
            if(conn != null) {

                try {
                    conn.close();
                } catch(SQLException e) {
                    e.getMessage();
                }
            }

        }
    }
    public static void main(String[] args) {

        SavePointTest pp=new SavePointTest();
        pp.err();

        System.out.println("over");


    }

}