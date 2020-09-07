package springCore.autoWiring.autowiredAnnotationWithComponentScanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
By default the dependency injection for @Autowired must be fulfilled because the value of required attribute
is true by default. We can change this behavior by using @Autowired(required=false). In this case if bean is not found
for dependency injection, it will not through error.
*/

@Service
public class EmployeeService {

private Employee employee;

public Employee getEmployee() {
	return employee;
}

//@Autowired
@Autowired(required = false)
public void setEmployee(Employee employee) {
	this.employee = employee;
}
}