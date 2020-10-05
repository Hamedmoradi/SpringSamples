package springCore.beanWrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
/*
org.springframework.beans.BeanWrapper is an interface and normally is not used directly.
It is used by BeanFactory and DataBinder. BeanWrapper plays with java beans to manipulate it.
It sets and gets value from java beans by the method BeanWrapper.setPropertyValue and BeanWrapper.getPropertyValue.
*/
public class SpringDemo {
   public static void main(String... args) {
	   BeanWrapper employee = new BeanWrapperImpl(new Employee());
	   employee.setPropertyValue("empName","Ram");
	   employee.setPropertyValue("age","21");
	   
	   BeanWrapper college = new BeanWrapperImpl(new College());
	   college.setPropertyValue("name", "SSIC");
	   college.setPropertyValue("director", employee.getWrappedInstance());
	   String name = (String)college.getPropertyValue("director.empName");
	   System.out.println(name);
   } 
}