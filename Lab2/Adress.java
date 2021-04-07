package pb3;
public class Adress {

	private String street, city;
	private int number;

	public Adress(String street, String city, int number) {
		super();
		this.street = street;
		this.city = city;
		this.number = number;
	}

	public String getStreet() {
		return this.street;
	}

	public String getCity() {
		return this.city;
	}

	public int getNumber() {
		return this.number;
	}

	public String getFullAdress() {
		return " Orasul " + this.city + ",strada " + this.street + ",numarul " + this.number;

	}

}
