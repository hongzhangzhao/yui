import java.sql.*;
import java.util.*;

public class Batch {

    public void  guibb() {
		DatabaseConnection dbc=new DatabaseConnection();
		
        Connection conn=dbc.getConnection();
        Statement st=null;

        try {

            st=conn.createStatement();
            st.addBatch("insert into china11(name,age) values('ershi',20)");
            st.addBatch("insert into china11(name,age) values('shiba',18)");
            st.addBatch("insert into china11(name,age) values('shijiu',19)");

            int [] x=st.executeBatch();
            System.out.println("ss");
		



        } catch(SQLException e) {
            e.getMessage();
        } catch(Exception e1) {
            e1.getMessage();
        }
        finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch(SQLException e1) {
                    e1.getMessage();
                }
            }


        }


    }
    public static void main(String[] args) {
        Batch bb=new Batch();
        bb.guibb();
        System.out.println("ok");

    }





}