public class FreteExpresso implements TipoDeFrete {

    @Override
    public double calcular(double distancia) {
        return distancia * 2.5;
    }
}
