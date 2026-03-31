package Exercicio01;

public class ValidadorUsuario {
    public static void validar (String email, int idade) throws EmailInvalidoException, IdadeInvalidaException{
        if (email == null || !email.contains("@")) {
            throw new EmailInvalidoException("Email inválido: deve conter '@'. Valor fornecido:" + email)
        }
    }
}
