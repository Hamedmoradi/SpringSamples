package springCore.disposablebean;

import org.springframework.beans.factory.DisposableBean;

public class Book implements  DisposableBean{
	private String bookName;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void destroy() {
	      System.out.println("Perform destructive work or release resources.");
	}
}
