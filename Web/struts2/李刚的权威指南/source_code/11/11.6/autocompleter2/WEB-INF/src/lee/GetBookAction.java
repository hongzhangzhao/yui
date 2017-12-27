package lee;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class GetBookAction extends ActionSupport
{
	private String author;
	private List<String> books = new ArrayList<String>();

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public List<String> getBooks()
	{
		return books;
	}

	public String execute() throws Exception
	{
		System.out.println(author);
		if (author.equals("&#26446;&#21018;"))
		{
			books.clear();
			books.add("Spring2.0����");
			books.add("������J2EE��ҵӦ��ʵս");
			books.add("����J2EE��Ajax����");
		}
		else if (author.equals("Rod Johnson"))
		{
			books.clear();
			books.add("Expert One-on-One J2EE Design and Development");
		}
		else if (author.equals("David Flanagan"))
		{
			books.clear();
			books.add("JavaScriptȨ��ָ��");
		}
		return SUCCESS;
	}

}