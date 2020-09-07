package springCore.beanLifeCycle.awareInterface.beanNameAware;

import org.springframework.beans.factory.BeanNameAware;
public class Book implements BeanNameAware {
private String bookName;
@Override
public void setBeanName(String name) {
	System.out.println("Bean Name:" + name);
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
}