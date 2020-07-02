package springCore.autoWiring.autowiredAnnotationWithConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
* Constructor arguments can also be autowired using @Autowired. If there are more than one constructor in the class,
* only one constructor can have @Autowired annotation. This constructor should not be public. Here the required
* attribute of @Autowired cannot be false. Find the example.
*/
@Service
public class EmployeeService {
private Employee employee;

@Autowired
private EmployeeService(Employee employee) {
	this.employee = employee;
}
public Employee getEmployee() {
	return employee;
}
}