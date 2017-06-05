import java.sql.*;

public class StatementExecute {

    public void statementExecute() {
        DatabaseConnection dc=new DatabaseConnection();
        Connection conn=dc.getConnection();
        Statement st=null;
        String sql="create table test(id int primary key,name varchar(45),age int)";

        try {
            st=conn.createStatement();
            st.execute(sql);
            st.close();

        } catch(SQLException e) {

        }


        finally {
            if(conn != null) {

                try {
                    conn.close();
                } catch(SQLException e) {

                }


            }



        }



    }

    public static void main(String[] args) {
        StatementExecute se=new StatementExecute();
        se.statementExecute();

    }



}