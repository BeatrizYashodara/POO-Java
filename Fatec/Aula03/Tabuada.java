package Aula03_03032026;
import java.util.Scanner;

public class Tabuada {
    public static void main (String [] args) {

        Scanner leitor = new Scanner (System.in);

        System.out.println("---APP de Tabuada---");

        boolean continuar = true;

        do{
            System.out.println("Escolha um numero: ");
        double n = leitor.nextDouble();

        System.out.println("A tabuada de " + n + " eh: ");

        for(int i = 0; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n*i );
        }

        System.out.println("");
        System.out.println("Fim da Tabuada do " + n + "!");

        System.out.println("Quer ver a tabuada de outro numero? 1 - Sim | 0 - Nao ");
        String opcao = leitor.nextLine();

        if (opcao == "1") {
            continuar = true;
        } else if (opcao == "0") {
            continuar = false;
        } else 
            System.out.println("opcao invalida, tabuada terminada");
            continuar = false;
            

        } while (continuar == true);
        

        leitor.close();
    }
}
