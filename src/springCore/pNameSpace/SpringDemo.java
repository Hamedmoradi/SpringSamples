package springCore.pNameSpace;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemo {
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("springCore/pNameSpace/app-conf.xml");
	    Employee employee=(Employee)context.getBean("emp");
	    System.out.println(employee.getEmpName());	     
	    System.out.println(employee.getCompany().getName());		
		context.close();
	}
}
