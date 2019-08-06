package course.sessao2;

public class ExpressaoCondicionalTernaria {

	public static void main(String[] args) {
		// Expressão condicional ternária
		// - Estrutura opcional ao if-elsequando se deseja decidir um VALORcom base em
		// uma condição

		// Sintaxe: ( condição ) ? valor_se_verdadeiro : valor_se_falso
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);

	}

}
