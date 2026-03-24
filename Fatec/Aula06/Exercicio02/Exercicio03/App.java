public class App{
    public static void main(String[] args) {
        
        ProcessadorDOCX procesDoc = new ProcessadorDOCX();
        ProcessadorPDF procesPDF = new ProcessadorPDF();

        System.out.println("---- Processador de Documentos ----");
        System.out.println("Processando e formatando arquivos para Docs: ");
        procesPDF.processar();
           
        System.out.println("Processando e formatando arquivos para Docs: ");
        procesDoc.processar();
    }

}
