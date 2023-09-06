package list.OperacoesBasicas;

public class TesteListaDeTarefas {
    
public static void main(String[] args) {
    
    //TESTE PARA ANALISAR METODOS DA LISTA DE TAREFAS

    //Criando a lista
    ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

    //Verificando se a lista inicial esta vazia < Valor desejado: 0 >
    System.out.println("Numero de itens na lista de tarefas quando criada: " + listaDeTarefas.obterNumeroTotalTarefas());

    //Adicionando tarefas
    listaDeTarefas.adicionarTarefa("Tarefa A");
    listaDeTarefas.adicionarTarefa("Tarefa B");
    listaDeTarefas.adicionarTarefa("Tarefa C");
    listaDeTarefas.adicionarTarefa("Tarefa B");


    //Verificando se os itens foram adicionados < Valor desejado: 4 > 
    System.out.println("Numero de itens na lista de tarefas apos adicao de tarefas: " + listaDeTarefas.obterNumeroTotalTarefas());
     listaDeTarefas.obterDescricaoTarefas();

    //Removendo tarefas
    listaDeTarefas.removerTarefa("Tarefa A");

    //Verificando se os itens foram removidos < Valor desejado: 3 > 
    System.out.println("Numero de itens na lista de tarefas apos remocao: " + listaDeTarefas.obterNumeroTotalTarefas());
    listaDeTarefas.obterDescricaoTarefas();

    //Removendo tarefas
    listaDeTarefas.removerTarefa("Tarefa B");

    //Verificando se os itens foram removidos < Valor desejado: 1 > 
    System.out.println("Numero de itens na lista de tarefas apos segunda remocao: " + listaDeTarefas.obterNumeroTotalTarefas());
    listaDeTarefas.obterDescricaoTarefas();
}

}
