package springCore.cNamespace;
public class Student {
	private City city;
	private String name;
	public Student(City city, String name){
		this.city=city;
		this.name=name;
	}
	public City getCity() {
		return city;
	}
	public String getName() {
		return name;
	}
}
