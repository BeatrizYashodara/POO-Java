package Exemplo02;

public class RetryStrategy implements EstrategiaTratamento{
    @Override
    public void tratar(Exception e) {
        System.out.println("Tentando novamente..." + e.getMessage());
        // lógica do retry
    }
}
