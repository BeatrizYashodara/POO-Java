import java.util.Scanner;

public class CalculadoraIMC {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

       System.out.println("--- Calculadora de IMC---");
       System.out.println("Qual é seu peso?");
        double peso = sc.nextDouble();
        System.out.println("Qual é a sua altura? ");
        double altura = sc.nextDouble();
        double IMC = peso / (altura * altura);
        System.out.println("Seu IMC eh: " + IMC);

        String ClassifIMC;

        if(IMC > 40 ){
            ClassifIMC = "Obesidade Grave - Grau III";
        }
        else 
            if(IMC > 39.9){
                ClassifIMC = "Obesidade - Grau II";
            } 
            else 
                if(IMC > 29.9){
                    ClassifIMC = "Sobrepeso - Grau I";
                }
                else 
                    if (IMC > 18.5){
                        ClassifIMC = "Normal - Grau 0";
                    } 
                    else 
                        ClassifIMC = "Magreza - Grau -1";

        System.out.println("Sua situacao de saude eh:58 " + ClassifIMC);

        sc.close();
    }
    
}
