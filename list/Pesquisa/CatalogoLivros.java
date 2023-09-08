package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    

//ATRIBUTOS
private List<Livro> catalogoList;


//CONSTRUTOR
public CatalogoLivros() {
    this.catalogoList = new ArrayList<>();
}

//METODOS
//adiciona livro ao catalogo
public void adicionarLivros(String titulo, String autor, int anoPublicacao){
    catalogoList.add(new Livro(titulo, autor, anoPublicacao));
}


//Retorna livros na busca pelo autor
public List<Livro> pesquisarPorAutor(String autor){

    //criando uma lista de retorno da busca
    List<Livro> resultadoBuscaList = new ArrayList<>();
    if(!catalogoList.isEmpty()){
        for(Livro l : catalogoList){
            if(l.getAutor().equalsIgnoreCase(autor)){
                resultadoBuscaList.add(l);
            }
        }
    }
    return resultadoBuscaList;
}


//Retorna livros na busca por intervalo de anos
public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

    //criando uma lista de retorno da busca
    List<Livro> resultadoBuscaList = new ArrayList<>();
    if(!catalogoList.isEmpty()){
        for(Livro l : catalogoList){
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao()<=anoFinal)
            resultadoBuscaList.add(l);
        }
    }
    return resultadoBuscaList;
}


//Retorna o primeiro livro encontrado na busca por titulos
public Livro pesquisarPorTitulo(String titulo){
    
    //criando o retorno da busca
    Livro resultadoBuscaLivro = null;
    if(!catalogoList.isEmpty()){
        for(Livro l : catalogoList){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                resultadoBuscaLivro = l;
                break;
            }
        }
    }
    return resultadoBuscaLivro;
}


}
