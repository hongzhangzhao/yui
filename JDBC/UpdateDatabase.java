import java.sql.*;

public class UpdateDatabase {

    
   

    public void updateData(String name,int age,int id) {
		DatabaseConnection dc=new DatabaseConnection();
        Connection conn=dc.getConnection();
		Statement st=null;
        String sql="update china11 set name=\""+name+"\",age="+age+ " where id="+id+" ";
        System.out.println(sql);
        try {
            st=conn.createStatement();

            st.executeUpdate(sql);






        } catch(SQLException e) {
            e.printStackTrace();
        }
        finally {

            if(conn != null) {
                try {
                    conn.close();
                } catch(SQLException e) {
                    e.printStackTrace();
                }
            }

            if(st != null) {
                try {
                    st.close();
                } catch(SQLException e) {
                    e.printStackTrace();
                }

            }

        }


    }



    public static void main(String[] args) {
        UpdateDatabase ud = new UpdateDatabase();
        ud.updateData("xiaoxiao",111,1);



    }
}