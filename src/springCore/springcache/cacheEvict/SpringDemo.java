package springCore.springcache.cacheEvict;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
@CacheEvict annotation in spring is used to evict cache value.
@CacheEvict is applied at method level. @Cacheable sets the value in cache and on the contrary @CacheEvict evicts the cache value.
 At any method we can apply @Cacheable to cache result and at any other method we can apply @CacheEvict to evict cache.
 @CacheEvict has an attribute allEntries. By default its value is false but if true then it will evict the cache wide.
 */

public class SpringDemo {
public static void main(String... args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("springCore/springcache/cacheEvict/spring.xml");
	Employee employee = (Employee) context.getBean("employee");
	
	//calling getEmployee method first time.
	System.out.println(employee.getEmployee(1));
	
	//calling getEmployee method second time. This time, method will not execute.
	System.out.println(employee.getEmployee(1));
	
	//calling setEmployee method to evict the cache value
	employee.setEmployee(1);
	
	//calling getEmployee method third time. This time, method will  execute again.
	System.out.println(employee.getEmployee(1));
}
}
