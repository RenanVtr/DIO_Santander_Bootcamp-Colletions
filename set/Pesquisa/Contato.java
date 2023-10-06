package set.Pesquisa;

public class Contato {
    

    //ATRIBUTOS
    private String nome;
    private int telefone;


    //CONTRUCTOR    
    public Contato(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }


    //SETTERS
    public String getNome() {
        return nome;
    }
    public int getTelefone() {
        return telefone;
    }


    //TOSTRING
    @Override
    public String toString() {
        return "Nome: " + nome + ", Tel.: " + telefone;
    }


    
    
}
