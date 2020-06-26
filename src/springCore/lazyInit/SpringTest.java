package springCore.lazyInit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("springCore/autoWiring/byname/autoWiringbynamebeans.xml");
        System.out.println("Feth springCore.applicationContextAware.bean B.");
//        context.getBean("testInitA"); // the result change and Bean B not initialized ...
        context.getBean("testInitB");
    }
}
