package springCore.autoWiring.autowiredWithQualifierAnnotation;
import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/*
 @Qualifier annotation is used on the field or parameter level. It defines a qualifier for autowiring. The use of
 @Qualifier is to fix that the bean with a given name will only qualify for dependency injection in autowiring.
 In the scenario where more than one bean is eligible to be autowired, we can use @Qualifier annotation.
 The same scenario can also be handled by @Primary annotation. @Qualifier defines more robust selection criteria than
 @Primary annotation.The @Qualifier is defined at constructor argument level as follows.
 */
public class SpringDemo {
	public static void main(String[] args) throws SQLException {
	    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.register(AppConfig.class);
	    ctx.refresh();
		AnimalService animal = ctx.getBean(AnimalService.class);
		animal.getAnimal().printName();
		System.out.println(animal.getZoo().getZooName());
    	ctx.registerShutdownHook();
	}
} 