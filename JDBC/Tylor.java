import java.sql.*;
import java.util.*;

public class Tylor {
		
    public void swift(int[] id,String[] name) {

        DatabaseConnection ddc=new DatabaseConnection();
        System.out.println(ddc);

        Connection conn=ddc.getConnection();
        PreparedStatement pps=null;
        String sql="insert into china11(id,name) values(?,?)";
			
        try {

            pps=conn.prepareStatement(sql);

            for(int i=0; i<id.length; i++) {
                pps.setInt(1,id[i]);
                pps.setString(2,name[i]);

                pps.addBatch();

            }


            int [] x=pps.executeBatch();

        } catch(SQLException e) {
            e.getMessage();
        }
        finally {
            try{

                conn.close();
            } catch(SQLException e1) {
                e1.getMessage();
            }


        }


    }

    public static void main(String[] args) {
        Tylor ty=new Tylor();
        //pdb.swift({22,23},{"ershier","ershishan"});

        int[] x= {22,23};
        
		String[] y= {"ershiser","ershisan"};
        
		ty.swift(x,y);




    }




}