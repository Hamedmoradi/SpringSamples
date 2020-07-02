package springCore.autoWiring.autowiredWithQualifierAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Zoo {
	public String getZooName() {
		return "ABC Zoo";
	}
}
