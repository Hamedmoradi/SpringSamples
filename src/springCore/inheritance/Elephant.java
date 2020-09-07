package springCore.inheritance;
public class Elephant extends Animal {
	private String location;
	public void initE() {
		System.out.println("Inside initE()");
	}	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}