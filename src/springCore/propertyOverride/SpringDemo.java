package springCore.propertyOverride;

import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	public static void main(String[] args) throws SQLException {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("springCore/propertyOverride/app-conf.xml");
		Person person=(Person)context.getBean("person");
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getLocation());
		context.registerShutdownHook();
	}
}
