package springCore.importAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AddConf {
	@Bean
	public Address getAddress(){
		return new Address("Varanasi");
	}
}
