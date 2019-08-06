package course.sessao2;

import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		double n = sc.nextDouble();
		
		while (n >= 0.0) {
			Double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.println("Enter another number: ");
			n = sc.nextDouble();
		}
		System.out.println("Negative number");
		
		sc.close();
	}

}
