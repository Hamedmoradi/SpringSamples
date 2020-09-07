package springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByassignable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByassignable.service.IUserService;
import springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByassignable.util.ICalcUtil;

@Configuration
@ComponentScan(basePackages = "springCore.componentScanFilter.springComponentScanIncludeAndExcludeFilterByassignable",
		includeFilters = @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = IUserService.class),
		excludeFilters = @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = ICalcUtil.class))
public class AppConfig {
}