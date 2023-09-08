package list.Pesquisa;

public class Livro {
    
//ATRIBUTOS
private String titulo;
private String autor;
private int anoPublicacao;

//GETTERS-SETTERS
public String getTitulo() {
    return titulo;
}
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
public String getAutor() {
    return autor;
}
public void setAutor(String autor) {
    this.autor = autor;
}
public int getAnoPublicacao() {
    return anoPublicacao;
}
public void setAnoPublicacao(int anoPublicacao) {
    this.anoPublicacao = anoPublicacao;
}

//CONSTRUTOR
public Livro(String titulo, String autor, int anoPublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
}

//toString
@Override
public String toString() {
    return "Livros [titulo=" + titulo + ", autor=" + autor + ", ano=" + anoPublicacao + "]";
}






}
