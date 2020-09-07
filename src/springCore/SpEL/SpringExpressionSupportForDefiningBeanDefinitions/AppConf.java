package springCore.SpEL.SpringExpressionSupportForDefiningBeanDefinitions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConf {
	@Bean(name="calc")	
	public Calculator calc(){
		return new Calculator();
	}
}
