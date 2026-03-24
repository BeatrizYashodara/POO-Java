public abstract class ProcessadorDeDocumento{

    final public void processar(){
        abrir();
        formatar();
        fechar();
    };

    public void abrir(){
        System.out.println("Abrindo documento...");
    }

    public void fechar(){
        System.out.println("Fechando documento...");
    }

    public abstract void formatar();
}
