package springCore.beanScopes.prototypeAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Address {
private String city = "Varanasi";

public Address() {
	System.out.println("My city:" + city);
}

public String getCity() {
	return city;
}
}