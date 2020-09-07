package springCore.beanLifeCycle.awareInterface.beanFactoryAware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 *
 *  BeanFactoryAware In bean life cycle org.springframework.beans.factory.BeanFactoryAware interface is implemented by
 * beans when it wants to aware of its owning BeanFactory. We need to override setBeanFactory() method.
 *  This method is called just after the dependency injection is completed. Using this method we can change the bean
 *  properties value.
 **/
@Configuration
public class AppConfig {
@Bean(name = "myBook")
public Book getBean() {
	Book book = new Book();
	book.setBookName("Mahabharat");
	return book;
}
}