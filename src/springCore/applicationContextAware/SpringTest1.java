package springCore.applicationContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest1 {
    public static void main(String[] args) {
        AbstractApplicationContext  context = new ClassPathXmlApplicationContext("springCore/applicationContextAware/applicationContextAwareTestBeans.xml");
        ApplicationContextAwareTest appcontext= (ApplicationContextAwareTest)context.getBean("appcontext");
        ApplicationContext appCon =appcontext.getApplicationContext();
        A a= (A)appCon.getBean("testA");
        a.doTask();
        context.registerShutdownHook();
    }
}
