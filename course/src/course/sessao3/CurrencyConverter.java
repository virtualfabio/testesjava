package course.sessao3;

public class CurrencyConverter {
	public static final double IOF = 1.06; // 6%
	
	public static double dolarToReal(double dolarPrice, double quantity) {
		return dolarPrice * quantity * IOF;
	}
}
