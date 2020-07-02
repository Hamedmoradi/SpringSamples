package springCore.autoWiring.autowiredUsingAutowiredAnnotationBeanPostProcessorInXML;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
AutowiredAnnotationBeanPostProcessor process the @Autowired annotation marked on setter method,
fields and constructor.
We need to create a bean for AutowiredAnnotationBeanPostProcessor in our application context XML.
*/
public class SpringDemo {
public static void main(String[] args){
	AbstractApplicationContext ctx =
			new ClassPathXmlApplicationContext("springCore/autoWiring/autowiredUsingAutowiredAnnotationBeanPostProcessorInXML/app-conf.xml");
	Employee emp = ctx.getBean(Employee.class);
	System.out.println(emp.getAddress().getCity());
	System.out.println(emp.getAddress().getState());
	ctx.registerShutdownHook();
}
}