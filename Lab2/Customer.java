package pb3;
public class Customer {
	
	private String lastName;
	private String firstName;
	private Adress adress;
	private PaymentMethod payMethode;
	private int age;

	public Customer(String lastName, String firstName, Adress adress, PaymentMethod payMethode, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.adress = adress;
		this.payMethode = payMethode;
		this.age = age;
	}

	public String getlastName() {
		return lastName;
	}

	public String getfirstName() {
		return firstName;
	}

	Adress getAdress() {
		return adress;
	}

	PaymentMethod getPayMethod() {
		return payMethode;
	}

	public String getCompleteName() {
		return   getfirstName() + " " + getlastName();
	}

}
