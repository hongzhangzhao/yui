import java.sql.*;
import java.util.*;


public class ListTest {
	
	
	

    public void jack(List<SimpleBean> userList) {

        DatabaseConnection bbc=new DatabaseConnection();
        System.out.println(bbc);

        Connection conn=bbc.getConnection();
        PreparedStatement pre=null;
        String sql="insert into china22(id,name) values(?,?)";

        try {

            pre=conn.prepareStatement(sql);
			
			for(int i=0;i<userList.size();i++){
				SimpleBean sb = userList.get(i);
				
				int id=sb.getId();
				String name=sb.getName();
				pre.setInt(1,id);
				pre.setString(2,name);
			pre.addBatch();	
			}
			
			
			
			
			
			
			
			
			
			
			
			/*
                SimpleBean s1=userList.get(0);
                int id=s1.getId();
				System.out.println(id);
				
                String name=s1.getName();
				System.out.println(name);

                SimpleBean s2=userList.get(1);
				int id2=s2.getId();
				System.out.println(id2);
                
                String name2=s2.getName();
				System.out.println(name2);
			
                
                pre.addBatch();

            */	


            int [] x=pre.executeBatch();
			System.out.print(Arrays.toString(x));

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
        ListTest lt = new ListTest();
        List<SimpleBean> li = new ArrayList<>();
        
        SimpleBean sl = new SimpleBean();
        SimpleBean sl1 = new SimpleBean();
		 
        sl.setId(4);
        sl.setName("si");
        sl1.setId(5);
        sl1.setName("wu");

        li.add(sl);
        li.add(sl1);

        lt.jack(li);

    }




}