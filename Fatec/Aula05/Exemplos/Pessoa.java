public class Pessoa {
	String nome;
	String cpf;
	double altura;
	double peso;
	Pessoa mae;
	Pessoa pai;
	LocalDate nascimento; 

	int getIdade(){
	LocalDate dataAtual = LocalDate.now();
	Period periodo = Period.between(nascimento, dataAtual);
	return periodo.getYears();
	}
}
