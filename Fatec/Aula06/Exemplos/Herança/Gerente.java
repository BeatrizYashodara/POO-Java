public class Gerente extends Funcionario {
  private String area;

  public Gerente(String nome, double salario, String area) {
    super(nome, salario); // Chama o construtor de Funcionario
    this.area = area;
  }
}
