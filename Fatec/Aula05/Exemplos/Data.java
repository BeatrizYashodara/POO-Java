public class Data {
	private int dia;
	private int mes;
	private int ano;

	public static String[] meses = { "JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ" };

public String getNomeDoMes() {
	return meses[this.mes-1];
	}

}
