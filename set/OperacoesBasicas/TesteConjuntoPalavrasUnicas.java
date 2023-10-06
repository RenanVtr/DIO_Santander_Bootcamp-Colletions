package set.OperacoesBasicas;

public class TesteConjuntoPalavrasUnicas {
    public static void main(String[] args) {
        

        //TESTE DA CLASSE CONJUNTO DE PALAVRAS UNICAS
        ConjuntoPalavrasUnicas conjPalavrasUnicas = new ConjuntoPalavrasUnicas(null);


        //Adicionando palavra ao conjunto
        conjPalavrasUnicas.adicionarPalavra("PALAVRA1");
        conjPalavrasUnicas.adicionarPalavra("PALAVRA2");
        conjPalavrasUnicas.adicionarPalavra("PALAVRA3");
        conjPalavrasUnicas.adicionarPalavra("PALAVRA4");


        //Verficando palavra
        System.out.println(conjPalavrasUnicas.verificarPalavra("PALAVRA5"));

        //Exibindo palavras no conjunto
        conjPalavrasUnicas.exibirPalavrasUnicas();

        //Removendo palavra d conjunto
        conjPalavrasUnicas.removerPalavra("PALAVRA1");

        //Exibindo palavras no conjunto
        conjPalavrasUnicas.exibirPalavrasUnicas();


        
    }
}
