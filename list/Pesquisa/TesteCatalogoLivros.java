package list.Pesquisa;

public class TesteCatalogoLivros {
    
    public static void main(String[] args) {
        

        //TESTE PARA ANALISAR METODOS DE CATALOGO DE LIVROS

        //Adicionando livros ao catalogo

        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivros("Titulo 1","Autor 1", 2000);
        catalogo.adicionarLivros("Titulo 2","Autor 1", 2010);
        catalogo.adicionarLivros("Titulo 1","Autor 2", 2008);
        catalogo.adicionarLivros("Titulo 2","Autor 2", 2006);
        catalogo.adicionarLivros("Titulo 3","Autor 3", 2002);
        catalogo.adicionarLivros("Titulo 4","Autor 3", 2015);


        //Pesquisando livros por autor
        System.out.println("Pesquisando pelo Autor 2");
        System.out.println(catalogo.pesquisarPorAutor("Autor 2"));

        System.out.println("Pesquisando pelo Autor 3");
        System.out.println(catalogo.pesquisarPorAutor("Autor 3"));


        //Pesquisando livros por titulo
        System.out.println("Pesquisando pelo titulo 1");
        System.out.println(catalogo.pesquisarPorTitulo("Titulo 1"));
        System.out.println("Pesquisando pelo titulo 4");
        System.out.println(catalogo.pesquisarPorTitulo("Titulo 4"));

        //Pesquisando livros pelo intervalo de anos
        System.out.println("Pesquisando livros de anos entre 2000 e 2008");
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2000, 2008));
        System.out.println("Pesquisando livros de anos entre 2010 e 2020");
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2010, 2020));




    }
}
