package springCore.autoWiring.autowiredAnnotationWithComponentScanAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "springCore.autoWiring.autowiredAnnotationWithComponentScanAnnotation")
public class AppConfig {
}