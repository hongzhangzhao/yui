import java.sql.*;
import java.io.*;


public class Clob {


    public void insert1(int id) {

        String sql="update china22 set content=? where id=?";
        System.out.println(sql);
        DatabaseConnection ddc=new DatabaseConnection();
        Connection conn=ddc.getConnection();
        PreparedStatement stmt=null;


        try {

            File file = new File("D:\\notebook\\JDBCexercise\\test2.txt");
            long ff=file.length();
            FileInputStream fis = new FileInputStream(file);

            stmt=conn.prepareStatement(sql);
            stmt.setAsciiStream(1,fis,ff);
            stmt.setInt(2,id);
            stmt.executeUpdate();
            stmt.close();

        } catch(IOException e1) {

        }

        catch(SQLException e) {

        }

        finally {
            try{
                conn.close();
            } catch(SQLException e) {}
        }

    }
    public static void main(String[] args) {
        Clob cc = new Clob();
        cc.insert1(1);

        System.out.println("good");

    }

}