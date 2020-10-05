package springCore.importAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration
@Import({EmpConf.class, AddConf.class})
public class CompConf {
	@Autowired
	private Employee employee;
	@Bean
	public Company getCompany(){
		return new Company(employee);
	}
}
