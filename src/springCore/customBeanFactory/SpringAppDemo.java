package springCore.customBeanFactory;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
FactoryBean in spring helps to create custom factory bean. Custom factory bean can initialize bean in the same way
as we configure in spring XML. The advantage of defining our own custom factory bean is custom initialization.
 All we need to do that we will write as class implementing FactoryBean and will override all the methods of FactoryBean
  and this custom factory bean should be registered in spring XML. And then we can fetch the bean as usual initialized
  by our custom factory bean.
*/
public class SpringAppDemo {
public static void main(String[] args) {
	System.out.println("...Loading beans...");
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("springCore/customBeanFactory/app-test.xml");
	System.out.println("...fetch MyBean to get Object....");
	MyBean myBean=context.getBean(MyBean.class);
	myBean.doTask();
}
}