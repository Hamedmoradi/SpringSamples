package springCore.beanLifeCycle.awareInterface.beanFactoryAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class Book implements BeanFactoryAware {
private String bookName;

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

@Override
public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	Book b = beanFactory.getBean(Book.class);
	b.setBookName(getBookName() + "-Updated");
}
}