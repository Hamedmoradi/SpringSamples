package springCore.beanLifeCycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="springCore.beanLifeCycle")
public class AppConfig {
	@Bean(name = "myBook")
	public Book getBean() {
		Book book = new Book();
		book.setBookName("Mahabharat");
		return book;
	}
}
