package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Problema3 {
	public static void main(String[] args) {

		int myArray[] = { 0, 2, 5, 9, 3, 13, 25, 31, 40, 1 };
		Arrays.sort(myArray);
		System.out.println("In ordine cresatoare, sirul este: " + Arrays.toString(myArray));

		Scanner scan = new Scanner(System.in);
		System.out.println("Numarul cautat este: ");
		int number = scan.nextInt();
		Cautare(myArray, number);

	}

	static boolean Cautare(int[] sir, int number) {
		boolean a = false;
		int s = -1;
		int stg = 0, drt = sir.length - 1;
		while (stg <= drt) {
			int Mij = (stg + drt) / 2;
			if (sir[Mij] == number) {
				a = true;
				s = Mij;
				break;
			}
			if (sir[Mij] > number)
				drt = Mij - 1;
			if (sir[Mij] < number)
				stg = Mij + 1;
		}
		System.out.println(a);
		if (a == true)
			System.out.println("Pozitia numarului este " + s);
		return a;

	}

}