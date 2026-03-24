public class CalculadoraDeFrete {
    
    public double calculaFrete(TipoDeFrete tipo, double distancia){
        return tipo.calcular(distancia);
    }
}
