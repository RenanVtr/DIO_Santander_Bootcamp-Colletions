package list.OperacoesBasicas;

public class TesteCarrinhoDeCompras {
    public static void main(String[] args) {
        
//TESTE PARA ANALISAR METODOS DE CARRINHO DE COMPRAS


//Criando o carrinho de compras
CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

//Verificando se o carrinho de compras esta vazio
carrinhoDeCompras.exibirItens();

//Adicionando itens ao carrinho
carrinhoDeCompras.adicionarItem("Item1", 5.1, 1);
carrinhoDeCompras.adicionarItem("Item2", 12.5, 3);
carrinhoDeCompras.adicionarItem("Item3", 20.0, 5);
carrinhoDeCompras.exibirItens();

//Calculando o valor total dos itens no carrinho
System.out.println("Valor Total: R$ " + carrinhoDeCompras.calcularValorTotal());

//Removendo item do carrinho de compras
carrinhoDeCompras.removerItem("Item2");
carrinhoDeCompras.exibirItens();
System.out.println("Valor Total: R$ " + carrinhoDeCompras.calcularValorTotal());
    }
}
