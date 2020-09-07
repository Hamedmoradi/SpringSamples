package springCore.beanScopes.singlton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Spring Bean Scope: singleton
singleton scope is default scope of a bean in spring container.
In this scope, spring creates only one instance of the bean and it is served for every request for that bean from cache
within the container. Only one instance of bean per bean id is created in singleton scope. If two beans with different
id but of same class is there in singleton scope, then two instances will be created of that class and in terms
of bean id, only one instance of bean is created. In singleton scope, one instance of bean is created by spring
container and put in cache. In spring bean dependency, singleton scoped bean is injected from cache as shared bean.
singleton scope is limited to spring container. This differs from the Java Singleton Design Pattern which is based
on per ClassLoader. In spring, singleton is per container and per bean. singleton scope is standard scope in spring
and is valid in standalone as well as web applications. singleton scope is used for stateless beans.
*/
public class SpringDemo {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("springCore/beanScopes/singlton/spring-config.xml");
}
}