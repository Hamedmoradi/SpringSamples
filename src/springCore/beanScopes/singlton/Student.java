package springCore.beanScopes.singlton;

public class Student {
private Address stAddress;

public Address getStAddress() {
	return stAddress;
}

public void setStAddress(Address stAddress) {
	this.stAddress = stAddress;
}
}