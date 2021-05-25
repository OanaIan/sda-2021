package lab4;

import java.util.Scanner;
import java.util.Random;

public class Problema5 {

	static final int Fx = 3;
	static final int Fy = 3;

	private static void printMatrice(int[][] matrice, int n, int m) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrice[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, m;

		System.out.println("Numar de linii: ");
		n = scan.nextInt();
		System.out.println("Numar de coloane: ");
		m = scan.nextInt();
		System.out.println();

		int[][] matrice = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrice[i][j] = new Random().nextInt(255);
			}
		}
		System.out.println("Matrice initiala: ");
		printMatrice(matrice, n, m);

		for (int i = 0; i < n; i = i + Fy) {
			for (int j = 0; j < m; j = j + Fx) {
				int maxFiltru = Math.min(Fx, m - j);
				int maxFy = Math.min(Fy, n - i);
				int sum = 0;
				for (int k = 0; k < maxFy; k++) {
					for (int l = 0; l < maxFiltru; l++) {
						sum += matrice[i + k][j + l];
					}
				}
				int medie = (int) sum / (maxFiltru * maxFy);
				for (int k = 0; k < maxFiltru; k++) {
					for (int l = 0; l < maxFiltru; l++) {
						matrice[i + k][j + l] = medie;
					}
				}

			}
		}
		System.out.println();
		System.out.println("Matrice finala : ");
		printMatrice(matrice, n, m);
	}
}