package springCore.beanLifeCycle.initializingBeanAndDisposableBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book implements InitializingBean, DisposableBean {
private String bookName;

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Inside afterPropertiesSet()");
	bookName += "-Updated";
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
	System.out.println("---Inside setBookName---");
}

@Override
public void destroy() throws Exception {
	System.out.println("Inside dispose()");
}
}