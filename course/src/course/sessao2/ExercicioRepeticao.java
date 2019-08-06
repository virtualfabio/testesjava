package course.sessao2;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioRepeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		char res = 'y';
		
		while (res == 'y') {
			System.out.println("Enter a number: ");
			double n = sc.nextDouble();			
			double sr = Math.sqrt(n);
			System.out.printf("Square root: %.3f%n", sr);

			System.out.println("Repeat (y/n): ");
			res = sc.next().charAt(0);	
		}
		//--------------------
		do {
			System.out.println("Enter a number: ");
			double n = sc.nextDouble();			
			double sr = Math.sqrt(n);
			System.out.printf("Square root: %.3f%n", sr);

			System.out.println("Repeat (y/n): ");
			res = sc.next().charAt(0);	
			
		} while (res != 'n');
		
		sc.close();

	}

}
