package springCore.autoWiring.autowiredAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
@Bean
public Company getCompany() {
	Company company = new Company();
	company.setCompName("ABCD Ltd");
	company.setLocation("Varanasi");
	return company;
}
@Bean
public Employee getEmployee() {
	return new Employee();
}
}
