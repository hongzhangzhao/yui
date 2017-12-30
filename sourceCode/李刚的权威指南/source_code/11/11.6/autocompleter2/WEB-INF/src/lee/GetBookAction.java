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
			books.add("Spring2.0宝典");
			books.add("轻量级J2EE企业应用实战");
			books.add("基于J2EE的Ajax宝典");
		}
		else if (author.equals("Rod Johnson"))
		{
			books.clear();
			books.add("Expert One-on-One J2EE Design and Development");
		}
		else if (author.equals("David Flanagan"))
		{
			books.clear();
			books.add("JavaScript权威指南");
		}
		return SUCCESS;
	}

}