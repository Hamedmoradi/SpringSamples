package springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAspectjType;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = "springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAspectjType",
		includeFilters = @Filter(type = FilterType.ASPECTJ, pattern="springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAspectjType..*Util+"),
		excludeFilters = @Filter(type = FilterType.ASPECTJ, pattern="springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByAspectjType..*DAO+"))
public class AppConfig {

}