package springCore.beanFactoryPostProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
BeanFactoryPostProcessor in spring belongs to the package org.springframework.beans.factory.config.
BeanFactoryPostProcessor is used to work on bean configuration metadata. BeanFactoryPostProcessor can change bean
configuration metadata potentially. It happens before other bean is initialized by spring container.
In spring, more than one BeanFactoryPostProcessor can be used and their order of execution
can be set by order attribute.
*/
public class SpringTest {
public static void main(String[] args) {
	AbstractApplicationContext context =
			new ClassPathXmlApplicationContext("springCore/beanFactoryPostProcessor/app-conf.xml");
	context.registerShutdownHook();
}
}