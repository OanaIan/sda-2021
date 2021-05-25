package lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problema1 {

	public static void main(String[] args) {

		int myArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		ArrayList myNewArray = new ArrayList();

		for (int i = 0; i < myArray.length; i++) {
			myNewArray.add(myArray[i]);
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("Pozitia aleasa pentru un numar intre 0 si 9: ");
		int position = -1;
		while (position < 0 || position > 9) {
			while (!scan.hasNextInt()) {
				scan.next();
			}
			System.out.println(" ");
			position = scan.nextInt();
		}
		System.out.println("Numar adaugat ");
		int myInt = scan.nextInt();

		myNewArray.add(position, myInt);
		System.out.println("Noul sir" + myNewArray);

		int copy[] = new int[11];
		for (int i = 0; i < myArray.length; i++) {
			copy[i] = myArray[i];
		}

		int n = copy.length;
		for (int j = n - 2; j >= position; j--)
			copy[j + 1] = copy[j];

		copy[position] = myInt;
		myArray = copy;
		System.out.println(Arrays.toString(copy));
	}
}