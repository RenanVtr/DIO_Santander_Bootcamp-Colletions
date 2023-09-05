package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    
//ATRIBUTOS-----------------------------
    private List <Tarefa> tarefaList;


//CONSTRUTOR---------------------------
    public ListaDeTarefas(){
        this.tarefaList = new ArrayList<>(0);
    }


//METODOS------------------------------

//Adicionar Tarefa a Lista de Tarefas
public void adicionarTarefa (String descricao){

    tarefaList.add(new Tarefa(descricao));
}


//Remover tarefas da Lista de Tarefas
public void removerTarefa (String descricao){
    

    //Criando uma lista de remocao que contenha a "descricao" desejada
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for (Tarefa tarefa : tarefaList) {
        if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
            tarefasParaRemover.add(tarefa);
        }
    }
    
    //Removendo todos os itens da lista de tarefas com base na lista de remocao
    tarefaList.removeAll(tarefasParaRemover);
}


//Obter numero de tarefas presentes na lista 
public int obterNumeroTotalTarefas() {
    int numeroTotalTarefas = tarefaList.size(); 
    return numeroTotalTarefas;
}


//Imprimir descricao de tarefas presentes na lista
public void obterDescricaoTarefas() {
    System.out.println(tarefaList);
}

}
