package springCore.beanScopes.singlton;

public class Teacher {
private Address teachAddress;

public Address getTeachAddress() {
	return teachAddress;
}

public void setTeachAddress(Address teachAddress) {
	this.teachAddress = teachAddress;
}
}