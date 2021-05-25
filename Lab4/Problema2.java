package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Problema2 {

	public static void main(String[] args) {

		int myArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Scanner scan = new Scanner(System.in);
		int position = -1;
		System.out.println("Introduceti un numar de la 0 la 9: ");
		while (position < 0 || position > 9) {
			while (!scan.hasNextInt()) {
				scan.next();
			}
			System.out.println("Introduceti un numar de la 0 la 9:");
		}

		int n = myArray.length - 1;
		for (int i = position; i < n; i++) {
			myArray[i] = myArray[i + 1];
		}

		myArray[n] = 0;
		System.out.println(Arrays.toString(myArray));

	}
}