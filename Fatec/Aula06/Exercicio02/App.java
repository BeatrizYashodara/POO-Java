public class App {
    
    public static void main(String[] args) {

        FreteNormal freteNormal = new FreteNormal();

        FreteExpresso freteExpresso = new FreteExpresso();

        FreteRetirada freteRetirada = new FreteRetirada();

        CalculadoraDeFrete calculadoraDeFrete = new CalculadoraDeFrete();

        System.out.println();
        
        System.out.println(calculadoraDeFrete.calculaFrete(freteNormal, 100));
    
        System.out.println(calculadoraDeFrete.calculaFrete(freteExpresso, 100));

        System.out.println(calculadoraDeFrete.calculaFrete(freteRetirada, 100));

        
    
    }
}
