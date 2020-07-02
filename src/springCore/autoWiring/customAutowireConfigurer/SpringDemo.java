package springCore.autoWiring.customAutowireConfigurer;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("springCore/autoWiring/customAutowireConfigurer/app-conf.xml");
	AnimalService service = context.getBean(AnimalService.class);
	service.getAnimal().printName();
	context.close();
}
}