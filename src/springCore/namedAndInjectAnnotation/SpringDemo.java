//package springCore.namedAndInjectAnnotation;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//public class SpringDemo {
//public static void main(String[] args) {
//	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//	ctx.register(AppConfig.class);
//	ctx.refresh();
//	EmployeeService service = ctx.getBean(EmployeeService.class);
//	System.out.println(service.getEmployee().getEmpMsg());
//	ctx.close();
//}
//}