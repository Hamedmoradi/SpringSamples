package springCore.autoWiring.autowiredAnnotationWithComponentScanAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Employee {

public String getEmpMsg() {
	return "Software makes world beautiful";
}
}
