package springCore.autoWiring.AutowiredAnnotationWithField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
The class field can also be autowired using @Autowired annotation. Any number of fields can be autowired within a class.
The fields which are autowired should not be public.
*/
@Service
public class EmployeeService {
@Autowired
private Employee employee;
public Employee getEmployee() {
	return employee;
}
}