package springCore.autoWiring.autowiredAnnotationwithComponentScanAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
In spring @ComponentScan annotation scans a given package for the classes annotated with @Component, @Service,
@Repository and @Controller. The classes with these annotations are behaved as bean. @Autowired works well with these
annotations. In our example we will annotate the classes with @Component and java configuration class will use
@ComponentScan to scan these classes.
*/
public class SpringDemo {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	ctx.register(AppConfig.class);
	ctx.refresh();
	EmployeeService service = ctx.getBean(EmployeeService.class);
	System.out.println(service.getEmployee().getEmpMsg());
	ctx.close();
}
}
