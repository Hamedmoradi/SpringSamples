package springCore.autoWiring.byConstructor;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/*
constructor autowiring is the analogous to byType autowiring.
In case of constructor autowiring, spring container fulfills constructor argument autowiring only.
1. If in spring container, only one bean of autowiring candidate for constructor argument is present, constructor based dependency is performed.
2. If there is more than one bean of same class type, autowiring will not be performed and fatal error is thrown.
3. If there is no bean of required class type for constructor autowiring, error is thrown.
*/

public class SpringDemoAutoWiringByConstructor {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("springCore/autoWiring/byConstructor/autoWiringbyConstractorBeans.xml");
	Employee employee = (Employee) context.getBean("employee");
	System.out.println(employee.getEmpName());
	System.out.println(employee.getAddress().getCity());
	System.out.println(employee.getAddress().getState());
	context.close();
}
}
