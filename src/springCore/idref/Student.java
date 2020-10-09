package springCore.idref;

public class Student {
  private String name;
  private String locationId;
  private City city;

  public Student() {
  }

  public Student(String name, String locationId, City city) {
	this.name = name;
	this.locationId = locationId;
	this.city = city;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public String getLocationId() {
	return locationId;
  }

  public void setLocationId(String locationId) {
	this.locationId = locationId;
  }

  public City getCity() {
	return city;
  }

  public void setCity(City city) {
	this.city = city;
  }
}