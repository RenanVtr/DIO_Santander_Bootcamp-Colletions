package list.Ordenacao;



public class Pessoa implements Comparable<Pessoa> {
    

    //ATRIBUTOS
    private String nome;
    private int idade;
    private double altura;

    //CONSTRUTOR
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }


    //GETTERS-SETTERS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    //toString
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }


    //METODO PARA IMPLEMENTAR O COMPAREBLE PARA O ATRIBUTO IDADE
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }


}


