package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;


    //METODO CONSTRUTOR
    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    //METODOS
    //Adiciona numero a lista
    public void adicionaNumero(int numero) {
        numerosList.add(numero);
    }

    //Calcula e retorna a soma dos numeros na lista
    public int calculaSoma(){
        int soma = 0;
        for (Integer numero : numerosList){
            soma = soma + numero;
        }
        return soma;
    }

    //Encontra e retorna o maior numero da lista
    public int encontrarMaiorNumero(){
        int maiorNumero;
        if (numerosList.isEmpty()){
            maiorNumero = 0;
        }
        else{
            maiorNumero = numerosList.get(0);
        for (Integer numero : numerosList){
            if (numero > maiorNumero){
                maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }

    //Encontra e retorna o menor numero da lista
    public int encontrarMenorNumero(){
        int menorNumero;
        if (numerosList.isEmpty()){
            menorNumero = 0;
        }else {
         menorNumero = numerosList.get(0);
        for (Integer numero : numerosList){
            if (numero < menorNumero){
                menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    //Retorna a lista de numeros
    public List<Integer> exibirNumeros(){


        return numerosList;
    }






    

    
   




}
