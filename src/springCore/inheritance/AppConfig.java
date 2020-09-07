package springCore.inheritance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Elephant elephant() {
		Elephant elephant = new Elephant();
		initAnimal(elephant);
		elephant.setLocation("Delhi");
		return elephant;
	}
	private void initAnimal(Animal animal) {
		animal.setName("Hathi");
		animal.setAge(30);
	}
}
