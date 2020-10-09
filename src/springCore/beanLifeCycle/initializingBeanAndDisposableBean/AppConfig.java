package springCore.beanLifeCycle.initializingBeanAndDisposableBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * In bean life cycle org.springframework.beans.factory.InitializingBean interface is a initialization callback whose
 *  method afterPropertiesSet() executes once the dependency injection is completed. This method is used to check if all
 * properties have been initialized or to perform any custom initialization. org.springframework.beans.factory.
 * DisposableBean interface is a destruction callback whose method destroy() executes before bean is going to be removed
 * from spring container. This method is used to release resources and is called on calling of close()
 * method of spring context.
 **/
@Configuration
@ComponentScan(basePackages = "springCore.beanLifeCycle.initializingBeanAndDisposableBean")
public class AppConfig {
@Bean(name = "myBook")
public Book getBean() {
	Book book = new Book();
	book.setBookName("Mahabharat");
	return book;
}
}
