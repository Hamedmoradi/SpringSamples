package springCore.propertySourceInspring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertySourceTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	
	ctx.register(Config.class);
	ctx.refresh();
	
	Person person = ctx.getBean(Person.class);
	
	System.out.println(person.getName());
	System.out.println(person.getAge());
}
}