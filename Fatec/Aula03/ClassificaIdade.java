import java.util.Scanner;

public class ClassificaIdade {
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("---Classificador de FAixa Etária---");

        System.out.println("Qual eh a sua idade? ");
        int idade = leitor.nextInt();

        String classifIdade;
        if (idade > 64){
            classifIdade = "idoso(a)";
        } else 
            if(idade > 21){
                classifIdade = " maior de idade";
            } else if (idade < 0) {
                classifIdade = "menor de idade"; } 
                else {
                    classifIdade = "Idade invalida!";
                }

        System.out.println("Voce eh " + classifIdade);
        
        leitor.close();
    }
}
