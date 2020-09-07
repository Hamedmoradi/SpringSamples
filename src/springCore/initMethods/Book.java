package springCore.initMethods;
public class Book {
	private String bookName;
	public void myPostConstruct() {
	     System.out.println("---Do initialization task---");
	     if(bookName != null) {
	    	 System.out.println("bookName property initialized with the value:"+ bookName);
	     }
	}	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void myPreDestroy() {
		System.out.println("---Release resources or perform destruction task---");
	}
}
