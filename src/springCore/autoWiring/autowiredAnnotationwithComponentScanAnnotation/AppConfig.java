package springCore.autoWiring.autowiredAnnotationwithComponentScanAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "springCore.autoWiring.autowiredAnnotationwithComponentScanAnnotation")
public class AppConfig {
}