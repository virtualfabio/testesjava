package course.sessao3;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter account number: ");
		int numero  = sc.nextInt();
		System.out.println("Enter account holder: ");
		String nome = sc.next();
		System.out.println("Is there an initial deposit? (y/n) ");
		char temDepositoInicial = sc.next().charAt(0);
		
		Conta conta;
		if(temDepositoInicial == 'y') {
			System.out.println("Enter initial deposit value: ");
			double valueDeposit  = sc.nextDouble();
			conta = new Conta(numero, nome, valueDeposit);
		}else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println("Enter a deposit value: ");
		conta.deposito(sc.nextDouble());
		
		System.out.println("-----");
		System.out.println(conta);
		
		System.out.println("Enter a withdraw value: ");
		conta.saque(sc.nextDouble());
		
		System.out.println("-----");		
		System.out.println(conta);
		
	}

}
