package course.sessao2;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ScannerTestes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Full name: ");
		String sentence = sc.nextLine();		
		System.out.println(sentence);
		//System.out.println(sentence.charAt(0));
		System.out.print("Your Age: ");
		int age = sc.nextInt();		
		System.out.println(age);
		
		String x, y, z;
		
		x = sc.next();
		y = sc.next();
		z = sc.next();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}
}

