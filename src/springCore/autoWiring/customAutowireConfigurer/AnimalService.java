package springCore.autoWiring.customAutowireConfigurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {
@Autowired
@DeerQualifier
private Animal animal;
public Animal getAnimal() {
	return animal;
}
}