package course.sessao2;

import java.util.Locale;

public class Program2 {

	public static void main(String[] args) {
		
		double a; 
		float b;
		a = 1223900.0234563; 
		b = (float)a;
		System.out.println(a);
		System.out.println(b);

	
		//---------
		double a2;
		int b2;
		a2 = 5.12;
		b2 = (int)a2;
		System.out.println(b2);
		
		//-------
		int x, z;
		double result;
		x = 5;
		z = 2;

		result = (double) x / z;
		System.out.println(result);
		
		System.out.printf("%.2f%n", result);
		System.out.printf("%.4f%n", result);
		Locale.setDefault(Locale.US);
		String name = "Fabio";
		int age = 33;
		System.out.printf("%.2f%n", result);
		System.out.printf("%s is %d years old.", name, age);
		
	}

}
