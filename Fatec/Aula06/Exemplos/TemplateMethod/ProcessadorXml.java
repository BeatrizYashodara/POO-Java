/*
subclasse concreta que implementa a parte variável do algortimo
para ler arquivos do tipo XML
*/

public class ProcessadorXml extends ProcessadorArquivo{
  @Override
  protected void lerConteudo(){
    System.out.println(">> Lendo e processando o conteúdo do arquivo XML.");
  }
}
