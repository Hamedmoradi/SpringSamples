package springCore.scheduler;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class XMLConfigSpringDemo {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springCore/scheduler/application-context.xml");
	}
}
