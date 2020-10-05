package springCore.springcache.concurrentMapBasedCache;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public class Employee {
@Cacheable("emp")
public String getEmployee(int empId){
	System.out.println("execute getEmployee method..");
	if(empId==1){
		return "Atul";
	}else{
		return "Sudhir";
	}
}
}