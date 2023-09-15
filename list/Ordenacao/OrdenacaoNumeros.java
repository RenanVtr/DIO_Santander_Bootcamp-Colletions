package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenacaoNumeros implements Comparable<OrdenacaoNumeros>{
    

    //ATRIBUTOS
    private List<Integer> ordenacaoNumerosList;



   //CONSTRUTOR 
    public OrdenacaoNumeros(List<Integer> ordenacaoNumerosList) {
        this.ordenacaoNumerosList = new ArrayList<>();
    }

    
    

    //METODOS
    //Adiciona numeros a lista
    public void adicionarNumero (int numero){
        ordenacaoNumerosList.add(numero);
    }

    //Ordena a lista de numeros de forma ascendente
    public List<Integer> ordenarAscendente(){
        //Criando uam copia da lista de numeros
        List<Integer> ordenadoAscendenteList = new ArrayList<>(ordenacaoNumerosList);
        //Ordenando a copia de forma ascendente
        Collections.sort(ordenadoAscendenteList);
        return ordenadoAscendenteList;
    }

    //Ordena a lista de numeros de forma descendente
    public List<Integer> ordenarDescendente(){
        //Criando uam copia da lista de numeros
        List<Integer> ordenadoDescendenteList = new ArrayList<>(ordenacaoNumerosList);
        //Ordenando a copia de forma descendente
        Collections.reverse(ordenarAscendente());
        return ordenadoDescendenteList;
    }




    //TOSTRING
    @Override
    public String toString() {
        return "OrdenacaoNumeros " + ordenacaoNumerosList;
    }




    @Override
    public int compareTo(OrdenacaoNumeros o) {
        return Integer.compare(, o);
    }



}
