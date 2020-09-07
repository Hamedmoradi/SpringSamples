package springCore.beanLifeCycle.awareInterface.beanNameAware;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 *
 * BeanNameAware
 * In bean life cycle org.springframework.beans.factory.BeanNameAware interface is aware of bean name in bean factory.
 *  This interface needs to be implemented by the bean and the method setBeanName() of BeanNameAware should be implemented.
 *  BeanNameAware.setBeanName() is called just after the dependency injection is completed.
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