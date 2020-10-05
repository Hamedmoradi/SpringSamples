package springCore.primaryAnnotation;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 @Primary annotation enables a bean that gets preference when more than one bean is qualified to autowire a single valued dependency.
 Suppose we have a super class or interface and it has some sub classes and all the subclasses are bean.
 Now in a class we have a setter method or property which is autowired for super class. In this case all the sub classes
  are eligible for dependency injection. And hence spring container will throw error because it is unable to select
  a bean for dependency injection because of more than one eligible candidate. In this case we can give preference
  to a bean using @Primary annotation on one sub class. Now this bean will be selected for the dependency injection.
  If we annotate two beans with @Primary annotation, again container will throw error. In XML, <bean> tag has primary
  attribute that can have true or false value.This is equivalent to @Primary annotation.
*/
public class SpringDemo {
public static void main(String[] args) throws SQLException {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.register(AppConfig.class);
	ctx.refresh();
	Animal animal = ctx.getBean(Animal.class);
	animal.displayName();
	ctx.registerShutdownHook();
}
} 