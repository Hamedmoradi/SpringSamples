package springCore.SpEL.TernaryOperator;

public class Student {
private String name;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isTall(String name){
	if("Ram".equalsIgnoreCase(name)){
		return	false;
	}else{
		return true;
	}
}
}