package springCore.propertySourceInspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:springCore/propertySourceInspring/prop.cfg")
public class Config {
@Autowired
Environment env;

@Bean
public Person person() {
	Person person= new Person();
	person.setName(env.getProperty("prop.name"));
	person.setAge(Integer.parseInt(env.getProperty("prop.age")));
	return person;
}
}
