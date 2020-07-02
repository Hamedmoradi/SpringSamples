package springCore.autoWiring.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
private Company company;
public Company getCompany() {
	return company;
}
@Autowired
void setCompany(Company company) {
	this.company = company;
}
}
