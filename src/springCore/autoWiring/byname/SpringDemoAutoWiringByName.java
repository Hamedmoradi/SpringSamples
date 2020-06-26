package springCore.autoWiring.byname;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * In case of byName autowire, spring container looks for springCore.applicationContextAware.bean in XML configuration that name is the same as class property name.
 *  If there is more than one springCore.applicationContextAware.bean of the same class with different springCore.applicationContextAware.bean names in our XML configuration,
 *  the autowiring will not conflict and take the matching springCore.applicationContextAware.bean name with class property name.
 *  Find the class being used as a springCore.applicationContextAware.bean in our example.*/

public class SpringDemoAutoWiringByName {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("springCore/autoWiring/byname/autoWiringbynamebeans.xml");
	Employee employee = (Employee) context.getBean("employee");
	System.out.println(employee.getEmpName());
	System.out.println(employee.getAddress().getCity());
	System.out.println(employee.getAddress().getState());
	context.close();
}
}
