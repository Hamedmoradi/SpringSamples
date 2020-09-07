package springCore.autoWiring.byname;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * In case of byName autowire, spring container looks for springCore.applicationContextAware.bean in XML configuration that name is the same as class property name.
 *  If there is more than one springCore.applicationContextAware.bean of the same class with different springCore.applicationContextAware.bean names in our XML configuration,
 *  the autowiring will not conflict and take the matching springCore.applicationContextAware.bean name with class property name.
 *  Find the class being used as a springCore.applicationContextAware.bean in our example.*/

/*The class has two properties, out of which address property has been annotated with @Autowired.
Find the XML configuration file where we are defining the beans for autowiring.*/

/*In our XML configuration file, we have created two beans with name address and address2 which is using same Address
class but has been initialized with different property values. In our Employee class, the property name for Address
class is address. The bean employee has been defined as autowire="byName". So the autowiring in Employee class,
will be performed using address bean.
In case container does not find any matching bean by name for autowiring, it will not through any error.*/

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
