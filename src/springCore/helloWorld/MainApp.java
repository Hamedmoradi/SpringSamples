package springCore.helloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springCore/helloWorld/helloWordBeans.xml");
        HelloWorld helloWorld=(HelloWorld)context.getBean("helloWorld");
        helloWorld.getMessage();
    }
}
