import java.util.Scanner;

public class CalculadorMedia {
    

	public static void main(String[] args) {
		System.out.println("--- Calculadora IMC---");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é a sua média?? Descubra!");
		System.out.println("Qual foi a sua nota na P1?");
		double p1 = sc.nextDouble();
		System.out.println("Qual foi a sua nota na P2?");
		double p2 = sc.nextDouble();
		double  media = ( p1 + p2 ) / 2.0 ;
        System.out.println("Sua média é " + media);

        sc.close();
	}

}
