package springCore.customPropertyEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("springCore/customPropertyEditor/spring.xml");
		Person person = (Person)context.getBean("person");
		PersonType ptype = person.getType();
		System.out.println(ptype.getTypeName());
	}
}   