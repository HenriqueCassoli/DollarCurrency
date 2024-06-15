package util;

public class CurrencyConverter {
	
	public static final double iof  = 0.06;

	public static double paid(double price , double bought) {
		return price * bought * (iof + 1.0 );
	}
}
