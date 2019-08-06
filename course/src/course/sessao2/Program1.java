package course.sessao2;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		///Scanner sc = new Scanner(System.in);

		System.out.println("Hello World");

		//sc.close();
		
		boolean completed = false;
		byte b = 127;
		short s = 12332;
		char c = 'A';
		char letter = '\u0041';
		int i = 128;
		long l = 123123L;
		float f = 12.3f;
		double d = 12.3;
		
		System.out.println(completed + " - " +  b + " - " + s + " - " + c + " - " + letter + " - " + i 
				 + " - " + l + " - " + f + " - " + d);
		
		String nome = "Fabio FS jk kjhhgjghjgjghgjuyuyursslpoiuytrewqxcvbnj kjkj kj k kj kj kjk kjjhkhk";
		Object obj1 = "bla bla";
		Object obj2 = 4.5f;
		System.out.println(nome + " - " + obj1 + obj2);
	}
}
