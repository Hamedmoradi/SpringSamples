package springCore.beanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
factory-bean is an attribute of bean tag in spring. It works with factory-method attribute of bean tag.
To understand factory-bean, we need to create a factory class which will have non- static methods to return the bean instance.
Factory class must have a static method to return the instance of class itself. For the example, we have two service classes and one factory class.
Factory class will return the instance of service classes. We need to follow below steps to work with factory-bean.
1. Create a bean for factory class and use factory-method attributes to declare factory instance method.
2. Now we will use factory-bean and factory-method attribute of bean tag.
3. factory-bean attribute will assign factory bean id and factory-method will assign method of factory class which
will return the object of class which will be considered as spring bean.In spring if a class has private constructor
and we want to initialize that bean, then factory-method will be used. In this case the bean must have static method
that will return the object of containing class.
*/
public class SpringDemo {
public static void main(String... args) {
	ApplicationContext context =
			new ClassPathXmlApplicationContext("springCore/beanFactory/spring-config.xml");
	UserService userService = (UserService) context.getBean("userService");
	context.getBean("loginService");
}
}