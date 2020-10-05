package springCore.importResource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
@Configuration
@ImportResource("classpath:springCore/importResource/app-conf.xml")
public class AppConfig  {
@Bean(name="entitlement")
public Entitlement entitlement(){
	Entitlement ent= new Entitlement();
	ent.setName("Entitlement");
	ent.setTime(20);
	return ent;
}
}