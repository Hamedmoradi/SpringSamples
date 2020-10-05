package springCore.springcache.cacheEvict;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public class Employee {
@CacheEvict(value = "emp", allEntries=true)
public void setEmployee(int empId){
	System.out.println("execute setEmployee method..");
}
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