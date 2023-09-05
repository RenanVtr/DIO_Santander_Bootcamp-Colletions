package list.OperacoesBasicas;

public class Tarefa {
    

    //ATRIBUTOS-----------------------
    private String descricao;


    //CONSTRUTOR----------------------
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }


    //GETTERS-SETTERS----------------
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    //toString
    @Override
    public String toString() {
        return  descricao ;
    }


    

}
