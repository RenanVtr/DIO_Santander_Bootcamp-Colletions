package list.OperacoesBasicas;

public class Item {
    
//ATRIBUTOS---------------------------------
private String nome;
private Double preco;
private int quantidade;

//CONSTRUTOR--------------------------------
public Item( String nome, Double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
}

//GETTERS-SETTERS-----------------------------
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public Double getPreco() {
    return preco;
}

public void setPreco(Double preco) {
    this.preco = preco;
}

public int getQuantidade() {
    return quantidade;
}

public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}

//toString-----------------------------------
@Override
public String toString() {
    return nome + " R$ " + preco + " Quantidade: " + quantidade ;
}


}
