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

/*
Tarefa 04

● No mesmo projeto:
○ Crie na classe Data:
■ Crie um método chamado isBissexto() que retorne true se o ano da data é
bissexto ou false caso contrário

○ Crie na classe Horário:
■ Crie um método chamado isManhã() que retorne true se o horário está entre 6h e
12h e false caso contrário
■ Crie um método chamado isTarde() que retorne true se o horário está entre 12h e
18h e false caso contrário
■ Crie um método chamado isNoite() que retorne true se o horário está entre 18h e
0h e false caso contrário
■ Crie um método chamado isMadrugada() que retorne true se o horário está entre
0h e 6h e false caso contrário
	*/

	public boolean isBissexto(){
		if(ano % 400 == 0)
			return true;
		else {
			if (ano % 100 == 0)
			return false;
			else if (ano % 4 == 0)
				return true;
			else
				return false;
		}
	}

	public boolean isMadrugada() {
		if(horas >= 0 && horas < 6) return true;
		else return false;
	}

	public boolean isManha() {
		if(horas >= 6 && horas < 12) return true;
		else return false;
	}

	public boolean isTarde() {
		if (horas >= 12 && horas < 18) return true;
		else return false;
	}

	public boolean isNoite() {
		if(horas >= 18 && horas < 24) return true;
		else return false;
	}
	
}
