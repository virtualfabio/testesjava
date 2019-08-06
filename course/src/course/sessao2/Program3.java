package course.sessao2;

public class Program3 {

	public static void main(String[] args) {
		
		double a = 1.0, b = -3.0, c = -4.0; 
		// F�rmula de Bhaskara 
		//  - � um m�todo resolutivo para equa��es do segundo grau utilizado
		//    para encontrar ra�zes a partir dos coeficientes da equa��o.
		double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		System.out.println(x1);

		System.out.println(Math.sqrt(4)); //raiz quadrada de 4
		
		int aa = 10;
		int bb = aa++;
		System.out.println(aa);
		System.out.println(bb);
	}
}
