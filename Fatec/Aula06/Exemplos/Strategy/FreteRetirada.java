/*
Estratégia Concreta para retirada no local, com custo zero.
*/
public class FreteRetirada implements TipoDeFrete {

  @Override
  public double calcular(double distancia){
    //Lógica específica para retirada: custo sempre zero, a distância
    return 0.0;
  }
}
