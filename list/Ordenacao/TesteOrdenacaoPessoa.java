package list.Ordenacao;

public class TesteOrdenacaoPessoa {
    public static void main(String[] args) {
        

        //TESTE DA CLASSE ORDENACAOPESSOAS

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas(null);
        
        //Adionando pessoas a lista
        ordenacaoPessoas.adicionarPessoa("Pessoa 1", 25, 1.80);
        ordenacaoPessoas.adicionarPessoa("Pessoa 2", 15, 1.40);
        ordenacaoPessoas.adicionarPessoa("Pessoa 3", 20, 1.50);
        ordenacaoPessoas.adicionarPessoa("Pessoa 4", 13, 1.75);
        ordenacaoPessoas.adicionarPessoa("Pessoa 5", 87, 1.90);


        //Ordenando pessoas pela idade
        System.out.println("Ordenando as pessoas por idade:");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());


        //Ordenando as pessoas pela altura
        System.out.println("Ordenando as pessoas pela altura:");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
