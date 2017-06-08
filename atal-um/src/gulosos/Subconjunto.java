package gulosos;

import java.util.Scanner;
public class Subconjunto {

	private static int num2;
	private static int conjunto[];

	public static void gerar(int num1, int num2) {

		if (num1 > num2) {

			for (int i = 1; i <= num2; i++)
				if (conjunto[i] == 1) {
					System.out.print(i + " ");
				} System.out.println(" ");

		} else {

			conjunto[num1] = 1;
			gerar(num1 + 1, num2);
			conjunto[num1] = 0;
			gerar(num1 + 1, num2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Número:");
		num2 = sc.nextInt();
		int temp = num2+1;
		conjunto = new int[temp];
		gerar(1, num2);
	}
}