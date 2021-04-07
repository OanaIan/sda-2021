package problema1;
import java.util.Scanner;
public class pb1 {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);

		System.out.println("Tipul de drum:");
		String var = x.next();
		System.out.println("Viteza maxima admisa pentru varianta1 - " + prima_var(var));
		System.out.println("Viteza maxima admisa pentru varianta2 - " + aDouaVar(var));
		System.out.println("Viteza maxima admisa pentru varianta3 - " + aTreiaVar(var));
	}

	public static int prima_var(String opt) {
		if (opt.equalsIgnoreCase("oras")) {
			return 50;
		} else {
			if (opt.equalsIgnoreCase("zona_rezidentiala")) {
				return 30;
			} else {
				if (opt.equalsIgnoreCase("drum_express")) {
					return 100;
				} else {
					if (opt.equalsIgnoreCase("autostrada")) {
						return 130;
					} else {
						return 0;
					}
				}
			}
		}
	}

	public static int aDouaVar(String opt) {

		switch (opt) {
		case "oras":
			return 50;
		case "zona_rezidentiala":
			return 30;
		case "drum_express":
			return 100;
		case "autostrada":
			return 130;
		}
		return 0;
	}

	public static int aTreiaVar(String opt) {
		if (opt.equalsIgnoreCase("oras")) {
			return 50;
		}
		if (opt.equalsIgnoreCase("zona_rezidentiala")) {
			return 30;
		}
		if (opt.equalsIgnoreCase("drum_express")) {
			return 100;
		}
		if (opt.equalsIgnoreCase("autostrada")) {
			return 130;
		}

		return 0;
	}

}
