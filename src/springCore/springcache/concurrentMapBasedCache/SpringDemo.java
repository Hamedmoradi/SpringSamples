package springCore.springcache.concurrentMapBasedCache;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
Spring provides Java based cache management using ConcurrentMap for simple functionalities.
 Spring provides ConcurrentMapCacheFactoryBean that comes under the package org.springframework.cache.concurrent.
  SimpleCacheManager is used to provide the cache manager. ConcurrentMap based Cache is simple to use and very high
  in performance but we can not use it for cache eviction. Overall we don't have very much control over cache if
  we use ConcurrentMap based Cache. So normally ConcurrentMap based Cache is used for basic functionalities,
   testing purpose.
 */

public class SpringDemo {
public static void main(String... args) {
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("springCore/springcache/concurrentMapBasedCache/spring.xml");
	Employee employee = (Employee) context.getBean("employee");
	
	//calling getEmployee method first time.
	System.out.println(employee.getEmployee(1));
	
	//calling getEmployee method second time. This time, method will not execute.
	System.out.println(employee.getEmployee(2));
	
	System.out.println(employee.getEmployee(1));
	
}
}
