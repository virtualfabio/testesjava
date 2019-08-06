package course.sessao2;

import java.util.Scanner;

public class SwitchTeste {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o dia da semana: ");
		int n = sc.nextInt();
		String nomeDia;

		switch (n) {
		case 1:
			nomeDia = "Domingo";
			break;
		case 2:
			nomeDia = "Segunda";
			break;
		case 3:
			nomeDia = "Terça";
			break;
		case 4:
			nomeDia = "Quarta";
			break;
		case 5:
			nomeDia = "Quinta";
			break;
		case 6:
			nomeDia = "Sexta";
			break;
		case 7:
			nomeDia = "Sabado";
			break;
		default:
			nomeDia = "Dia invalido!";
			break;
		}

		System.out.println(nomeDia);

		sc.close();
	}

}
