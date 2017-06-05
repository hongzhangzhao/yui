import java.sql.*;

public class Transaction {

    public void insert() {

        DatabaseConnection dc=new DatabaseConnection();
        Connection conn=dc.getConnection();
        Statement st=null;
        String sql1="insert into china11(id,name,age) values(12,\"kuakua\",123)";
        String sql2="insert into china11(id,name,age) values(12,\"nana\",567)";


        try {
            conn.setAutoCommit(false);
            st=conn.createStatement();
            st.executeUpdate(sql1);
            st.executeUpdate(sql2);
			conn.commit();

        } catch(SQLException e) {
            try {
                conn.rollback();
				
            } catch(SQLException ee) {}
        } finally {
            if(conn != null) {
                try {
                    conn.close();
					
                } catch(SQLException e) {}

            }


        }

    }
    public static void main(String[] args) {
		
		Transaction tt=new Transaction();
		
		tt.insert();
		



    }

}