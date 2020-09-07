package springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAnnotation;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAnnotation.service.IUserService;

@Configuration
@ComponentScan(basePackages = "springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAnnotation",
     includeFilters = @Filter(type = FilterType.REGEX, pattern="springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilter.*.*Util"),
     excludeFilters = @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = IUserService.class))
public class AppConfig {

}
