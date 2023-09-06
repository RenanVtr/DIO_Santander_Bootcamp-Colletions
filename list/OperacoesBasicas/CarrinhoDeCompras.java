package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    

//ATRIBUTOS--------------------
    private List<Item> carrinhoList;

//CONSTRUTOR --------------------
    public CarrinhoDeCompras(){
        this.carrinhoList = new ArrayList<>(0);
    }


//METODOS ----------------------
//Adiciona Item ao CarrinhoDeCompras
public void adicionarItem(String nome, Double preco, int quantidade){
    carrinhoList.add(new Item(nome, preco, quantidade));
}


//Remove Itens do CarrinhoDeCompras
public void removerItem(String nome){
    List<Item> itensParaRemover = new ArrayList<>();

    //Criando lista de remocao
    for (Item item : carrinhoList){
        if (item.getNome().equals(nome)){
            itensParaRemover.add(item);
        }
    }
    //Removendo todos os itens do CarrinhoDeCompras com base na lista de remocao
    carrinhoList.removeAll(itensParaRemover);
}

//Calcula o valorTotal dos Itens no CarrinhoDeCompras
public Double calcularValorTotal(){
    Double valorTotal = 0.00;

    for (Item item : carrinhoList) {
         valorTotal = valorTotal + item.getPreco() * item.getQuantidade();
    }
    return valorTotal;
}


//Imprime os Itens do CarrinhoDeCompras
public void exibirItens(){
    System.out.println(carrinhoList);
}
}