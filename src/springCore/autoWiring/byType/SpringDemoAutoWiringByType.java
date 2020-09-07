package springCore.autoWiring.byType;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*In case of byType autowiring, spring container looks for the class type. If in our XML configuration,
there is more than one eligible candidate by class type for autowiring, the container will through error.
There are three scenarios that may happen in case of by type autowiring.
1. If in the container, there is only one bean of required class type then autowiring is performed.
2. If there is more than one bean of same class type in the container, a fatal error is thrown and autowiring is not performed.
3. If there is no bean of required class type in the container, obviously no autowiring performed and also no error is thrown.
* Here we have two beans one for Address and one for Employee class. The Employee has been set by type autowiring using
* attribute autowire="byType". Autowiring for address of Employee is performed.
*/
public class SpringDemoAutoWiringByType {
public static void main(String[] args) {
	AbstractApplicationContext context =
			new ClassPathXmlApplicationContext("springCore/autoWiring/byType/autoWiringbyTypebeans.xml");
	Employee employee = (Employee) context.getBean("employee");
	System.out.println(employee.getEmpName());
	System.out.println(employee.getAddress().getCity());
	System.out.println(employee.getAddress().getState());
	context.close();
}
}
