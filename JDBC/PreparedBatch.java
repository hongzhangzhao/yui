import java.sql.*;
import java.util.*;

public class PreparedBatch {

    public void maKa() {

        DatabaseConnection ddc=new DatabaseConnection();
		System.out.println(ddc);
		
        Connection conn=ddc.getConnection();
        PreparedStatement pps=null;
        String sql="insert into china11(name,age) values(?,?)";

        try {

            pps=conn.prepareStatement(sql);

            pps.setString(1,"ershiyi");
            pps.setInt(2,21);
			
			pps.addBatch();
 
            int [] x=pps.executeBatch();

        } catch(SQLException e) {
            e.getMessage();
        }
        finally {
            try{

                conn.close();
            } catch(SQLException e1) {
                e1.getMessage();n
            }


        }


    }

public static void main(String[] args){
	PreparedBatch pdb=new PreparedBatch();
	pdb.maKa();
	System.out.println("ok");
	
	
}




}