package springCore.autoWiring.autowiredAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
In spring framework, dependency injection of bean can be achieved automatically by using @Autowired annotation.
We can use @Autowired annotation on field, setter method or constructor. In this case, the required bean for dependency
injection is searched by spring container.If more than one bean is eligible for autowiring, the error will be thrown.
We can avoid such situation by using @Primary annotation on one bean out of all eligible beans.
@Autowired looks for a bean to achieve dependency injection and if it does not find any suitable bean,
it throws error. This is the default behavior of it.
We can change this behavior by using @Autowired(required=false). To identify @Autowired annotation,
we can use AutowiredAnnotationBeanPostProcessor class as bean in XML.
If we are using context:annotation-config or context:component-scan tag in XML that will also identify @Autowired
annotation. In java configuration, @ComponentScan will also identify the @Autowired annotation. Find the examples.
*/
public class SpringDemo {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.register(AppConfig.class);
	ctx.refresh();
	Employee employee = ctx.getBean(Employee.class);
	System.out.println("Company Name:" + employee.getCompany().getCompName());
	System.out.println("Location:" + employee.getCompany().getLocation());
	ctx.close();
}
}
