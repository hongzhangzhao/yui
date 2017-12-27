
package lee;
/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class UserBean
{
	private String username;
	private String password;
	private String tip;

	
	public void setUsername(String username) {
		this.username = username; 
	}

	public void setPassword(String password) {
		this.password = password; 
	}

	public void setTip(String tip)
	{
		this.tip = tip;
	}

	public String getUsername() {
		return (this.username); 
	}

	public String getPassword() {
		return (this.password); 
	}
	public String getTip()
	{
		return tip;
	}
}
