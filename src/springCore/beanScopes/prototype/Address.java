package springCore.beanScopes.prototype;

public class Address {
private String city;

public Address(String city) {
	this.city = city;
	System.out.println("My city:" + city);
}

public String getCity() {
	return city;
}
}