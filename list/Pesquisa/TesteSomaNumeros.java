package list.Pesquisa;

public class TesteSomaNumeros {
    

    public static void main(String[] args) {
        
    //TESTE DE METODOS DA CLASSE SOMANUMEROS

    SomaNumeros somaNumeros = new SomaNumeros();


    //Adicionando numeros a lista
    somaNumeros.adicionaNumero(22);
    somaNumeros.adicionaNumero(-10);
    somaNumeros.adicionaNumero(54);
    somaNumeros.adicionaNumero(86);
    somaNumeros.adicionaNumero(0);

    //Exibindo numeros da lista
    System.out.println("A lista de numeros é : " + somaNumeros.exibirNumeros());


    //Somando numeros da lista
    System.out.println("A soma dos numeros é : " + somaNumeros.calculaSoma());


    //Encontrando o maior numero da lista
    System.out.println("O maior numero da lista é: " + somaNumeros.encontrarMaiorNumero());

    //Encontrando o menor numero da lista
    System.out.println("O menor numero da lista é: "+ somaNumeros.encontrarMenorNumero());
    }
}
