package springCore.autoWiring.autowiredAnnotationWithConstructor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "springCore.autoWiring.autowiredAnnotationWithConstructor")
public class AppConfig {
}