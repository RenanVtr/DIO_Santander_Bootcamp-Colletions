package list.Ordenacao;

public class TesteOrdenacaoNumero {
    
public static void main(String[] args) {
    

//TESTE PARA ANALISAR METODOS DA CLASSE ORDENACAONUMEROS

//Criando lista de numeros
OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros(null);

ordenacaoNumeros.adicionarNumero(5);
ordenacaoNumeros.adicionarNumero(7);
ordenacaoNumeros.adicionarNumero(1);
ordenacaoNumeros.adicionarNumero(8);
ordenacaoNumeros.adicionarNumero(4);
ordenacaoNumeros.adicionarNumero(3);
ordenacaoNumeros.adicionarNumero(9);

System.out.println(ordenacaoNumeros);


//Ordenando a lista de numeros em ordem acendente
System.out.println("Ordenacao Ascendente: " + ordenacaoNumeros.ordenarAscendente());

//Ordenando a lista de numeros em ordem descendente
System.out.println("Ordenacao Descendente: " + ordenacaoNumeros.ordenarDescendente());


}

}
