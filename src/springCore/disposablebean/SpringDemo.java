package springCore.disposablebean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringDemo {
	public static void main(String[] args) {
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("springCore/disposablebean/spring-config.xml");
		Book book = (Book)context.getBean("book");
		System.out.println("Book Name:"+ book.getBookName());
	    context.registerShutdownHook();
	}
}