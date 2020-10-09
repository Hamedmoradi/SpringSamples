package springCore.cNamespace;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
 * c-namespace has been introduced in spring 3.1. It replaces the old style of constructor-arg. The bean which needs to
 *  be configured with c-namespace, must have constructor to accept those arguments. Find the old style for constructor
 * dependency injection.
 * */

public class SpringDemo {
public static void main(String[] args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("springCore/cNamespace/app-conf.xml");
	Student st = (Student) context.getBean("student");
	System.out.println("Student Name:" + st.getName());
	System.out.println("City Name:" + st.getCity().getCityName());
	System.out.println("City Population:" + st.getCity().getPopulation());
	context.close();
}
}
