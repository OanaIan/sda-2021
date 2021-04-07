package pb3;
public class Main {

	public static void main(String[] args) {

		Adress ad1 = new Adress(" Iuliu Maniu", "Brasov", 1);
		PaymentMethod pay1 = new PaymentMethod("Card");
		Customer c1 = new Customer("Popescu", "Ion", ad1, pay1, 21);

		System.out.println( "Numele este: " + c1.getCompleteName());
		System.out.println("Adresa este :" + c1.getAdress().getFullAdress());
		System.out.println("Metoda de plata aleasa este : " + c1.getPayMethod().getType());
	}
}
