package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    

    //ATRIBUTOS
    private Set<Contato> contatosSet;

    
    //CONSTRUTOR
    public AgendaContatos(Set<Contato> contatosSet) {
        this.contatosSet = new HashSet<>();
    }

    //METODOS
    //Adiciona contato a lista de contatos
    public void adicionarContato(String nome, int numero){
        contatosSet.add(new Contato(nome, numero));
    }

    //Exibe contatos da lista
    public void exibirContatos(){
        System.out.println(contatosSet);
    }

    //Pesquisa contato na lista
    public void pesquisarPorNome(String nome){

    }

    //Atualiza numero de telefone do contato
    public void atualizarNumeroContato(String nome, int novoNumero){

    }
}
