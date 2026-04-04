package br.gov.sp.fatec.pg.oo;

public class Carro {
	public static int numeroDeRodas = 4;

	private String cor;
	private String placa;

	public void exibirInformacoes() {
	// Acessando atributos de instância: Apenas pelo 'this'
	System.out.println("-----------------------------------------");
	System.out.println("Carro com placa: " + this.placa);
	System.out.println("Cor do carro (instancia): " + this.cor);
	//Acessando atributos de classe: via 'this' ou diretamente pela classe.
	System.out.println("Numero de rodas (classe): " + Carro.numeroDeRodas);

	System.out.println("-----------------------------------------");

	}

}
