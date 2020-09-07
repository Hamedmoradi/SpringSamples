package springCore.beanLifeCycle.postConstructAndPreDestroyAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
/*
 * Here we will discuss the role of JSR-250 @PostConstruct and @PreDestroy annotation in spring bean life cycle.
 * Spring recommends these annotations to use as initialization and destruction callbacks.
 *  @PostConstruct annotated method executes just after dependency injection is completed to perform any initialization.
 *  It is customary to specify name as init(). @PreDestroy annotated method executes before the bean is being removed
 * from spring container. It is commonly used to release resources held by bean. It is customary to specify name as destroy().
 *  This method is called on calling of close() method of spring context.
 **/
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "springCore.beanLifeCycle.postConstructAndPreDestroyAnnotation")
public class AppConfig {
@Bean(name = "myBook")
public Book getBean() {
	Book book = new Book();
	book.setBookName("Mahabharat");
	return book;
}
}
