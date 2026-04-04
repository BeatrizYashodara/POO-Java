/*
Classe que representa um Circulo.
Tambem é uma subclasse de Figura. 
*/

public class Circulo extends Figura{
  private double raio;

  // Construtor para inicializar o raio
  public Circulo (double raio){
    this.raio = raio;
  }

  /*
  Implementação concreta do método abstrato.
  Usa a constante Math.PI para o cálculo da área do círculo.
  */
  @Override
  public double calcularArea(){
    return Math.PI * (this.raio * this.raio);
  }
}
