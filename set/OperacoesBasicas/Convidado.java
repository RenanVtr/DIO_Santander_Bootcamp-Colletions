package set.OperacoesBasicas;

public class Convidado {
    

    //ATRIBUTOS
    private String nome;
    private int codigoConvite;


    //CONSTRUTOR
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }



    //GETTERS-SETTERS
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getCodigoConvite() {
        return codigoConvite;
    }


    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }


    //TOSTRING
    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
    }

    

    
}
