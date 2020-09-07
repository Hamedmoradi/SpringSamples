package springCore.beanLifeCycle.postConstructAndPreDestroyAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {
private String bookName;

@PostConstruct
public void init() {
	System.out.println("inside init()");
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
	System.out.println("---Inside setBookName---");
}

@PreDestroy
public void destroy() {
	System.out.println("inside destroy()");
}
}