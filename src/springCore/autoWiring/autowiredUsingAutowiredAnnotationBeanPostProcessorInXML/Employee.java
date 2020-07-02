package springCore.autoWiring.autowiredUsingAutowiredAnnotationBeanPostProcessorInXML;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
@Autowired
private Address address;
public Address getAddress() {
	return address;
}
}