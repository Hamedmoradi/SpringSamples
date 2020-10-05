package springCore.primaryAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Tiger implements Animal {
	@Override
	public void displayName() {
		System.out.println("-- Tiger ---");
	}
}
