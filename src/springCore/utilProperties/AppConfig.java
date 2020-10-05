package springCore.utilProperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:springCore/utilProperties/app-conf.xml")
public class AppConfig  {
private @Value("#{entProp['entitlement.name']}") String entName;
private @Value("#{entProp['entitlement.time']}") int entTime;

private @Value("#{subProp['subscription.name']}") String subName;
private @Value("#{subProp['subscription.type']}") String subType;

@Bean(name="entitlement")
public Entitlement entitlement(){
	Entitlement ent= new Entitlement();
	ent.setName(entName);
	ent.setTime(entTime);
	return ent;
}

@Bean(name="subscription")
public Subscription subscription(){
	Subscription sub= new Subscription();
	sub.setName(subName);
	sub.setType(subType);
	return sub;
}

}
