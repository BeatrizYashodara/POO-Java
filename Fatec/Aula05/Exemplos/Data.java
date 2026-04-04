public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	public Data( int dia, int mes, int ano ) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public static String[] meses = { "JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ" };

public String getNomeDoMes() {
	return meses[this.mes-1];
	}

/*
Tarefa 01: 
No projeto da aula anterior Crie na classe Data um método chamado “getData” sem
parâmetros que retorne uma String com a data no formato
“DD/MM/AAAA”
SOLUÇÃO: */
	public String getData() {
	String out = "";
	if(getDia() <10) out += "0";
	out += getDia() + "/";
	if(getMes() < 10 ) out += "0";
	out += getMes() + "/";
	out += getAno();
	return out;
	}



	
	
}
