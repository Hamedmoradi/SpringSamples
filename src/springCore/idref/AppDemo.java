package springCore.idref;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDemo {
  public static void main(String... args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("springCore/idref/app-context.xml");
	Student st = (Student) context.getBean("student");
	System.out.println("name: " + st.getName());
	System.out.println("locationId: " + st.getLocationId());
	System.out.println("city: " + st.getCity().getCityName());
	context.close();
  }
}