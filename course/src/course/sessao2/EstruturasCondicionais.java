package course.sessao2;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero inteiro: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		sc.close();
	}

}
