package springCore.importAnnotation;

public class Company {
	private Employee ceo;
	public Company(Employee ceo) {
		this.ceo = ceo;
	}
	public Employee getCeo() {
		return ceo;
	}
}
