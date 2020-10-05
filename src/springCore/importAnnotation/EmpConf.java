package springCore.importAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class EmpConf {
	@Autowired
	private Address address;
	@Bean
	public Employee getEmployee(){
		return new Employee(address);
	}
}
