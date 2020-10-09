package springCore.innerBean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemo {
	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("springCore/innerBean/app-conf-1.xml");
        Student st=(Student) context.getBean("student");
        System.out.println("Student Name:"+ st.getName());
        System.out.println("City Name:"+st.getCity().getCityName());
        System.out.println("City Population:"+st.getCity().getPopulation());        
		context.close();
	}
}
