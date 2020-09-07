package springCore.beanScopes.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Spring Bean Scope: prototype
In spring prototype scope, spring container creates new instance of bean for each and every request for that bean.
In spring bean dependency, prototype scoped bean is served by creating new instance of bean for each and every bean dependency.
prototype scope is used for stateful beans. Spring container does not maintain the full record of prototype scoped beans.
After instantiating bean and submitting it to client, spring container does not maintain the record.
So to release the resources held by prototype scoped bean, client should implement custom bean post-processor.
prototype scope is spring standard scope and can be used in standalone as well as web application of spring.
*/
public class SpringDemo {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("springCore/beanScopes/prototype/spring-config.xml");
}
}