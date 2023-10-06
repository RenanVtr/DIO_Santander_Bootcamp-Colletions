package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    //ATRIBUTOS
    private Set<String> palavraSet;

        

    public ConjuntoPalavrasUnicas(Set<String> palavraSet) {
        this.palavraSet = new HashSet<>();
    }

    //METODOS
    //Adiciona palavra ao conjunto de palavras
    public void adicionarPalavra (String palavra){
        palavraSet.add(palavra);
    }

    //Remove palavra do conjunto de palavras
    public void removerPalavra (String palavra){
        
        for (String p : palavraSet ){
            if (p == palavra){
                palavraSet.remove(p);
                break;
            }
        }
    }

    //Verifica se a palavra esta presente no conjunto
    public boolean verificarPalavra(String palavra){
        Boolean valido = false;
        for (String string : palavraSet) {

            if (string.equals(palavra))
                valido = true;
        }
        return valido;
        }


    //Exibe todas as palavras no conjunto de palavras
    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);

    }

    public Set<String> getPalavraSet() {
        return palavraSet;
    }



}


