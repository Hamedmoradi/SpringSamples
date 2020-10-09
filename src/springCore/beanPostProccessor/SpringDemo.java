package springCore.beanPostProccessor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringDemo {
	public static void main(String[] args) {
		AbstractApplicationContext  context =
				new ClassPathXmlApplicationContext("springCore/beanPostProccessor/app-conf.xml");
		Animal animal=(Animal)context.getBean("animal");
		System.out.println(animal.getName());
    	context.registerShutdownHook();
	}
} 