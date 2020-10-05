package springCore.lazyInit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
lazy-init in spring is the attribute of bean tag. The values of lazy-init are true and false. If lazy-init is true,
then that bean will be initialized when a request is made to bean. This bean will not be initialized when the spring
container is initialized. If lazy-init is false then the bean will be initialized with the spring container
initialization and this is the default behavior.
By default, ApplicationContext implementations eagerly create and configure all singleton beans as part of the
initialization process. Generally, this pre-instantiation is desirable, because errors in the configuration or
surrounding environment are discovered immediately, as opposed to hours or even days later. When this behavior
is not desirable, you can prevent pre-instantiation of a singleton bean by marking the bean definition
as lazy-initialized. A lazy-initialized bean tells the IoC container to create a bean instance when it is first
requested, rather than at startup.
@Lazy Annotation in spring is used with @Configuration.
The bean which has been declared with @Lazy annotation will not be initialized by spring container.
@Lazy will be initialized by container only when that bean will be accessed somewhere in code.
*/
public class SpringTest {
public static void main(String[] args) {
	ApplicationContext context =
            new ClassPathXmlApplicationContext("springCore/lazyInit/lazyInitBeans.xml");
	System.out.println("Feth springCore.applicationContextAware.bean B.");
//        context.getBean("testInitA"); // the result change and Bean B not initialized ...
	context.getBean("testInitB");
}
}
