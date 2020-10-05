package springCore.springInjectDate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("springCore/springInjectDate/spring.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person.getDob());
	}
}   