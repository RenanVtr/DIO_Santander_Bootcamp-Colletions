package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    

    //ATRIBUTO
    private List<Pessoa> pessoasList;

   

    //CONSTRUTOR
    public OrdenacaoPessoas(List<Pessoa> pessoasList) {
        this.pessoasList = new ArrayList<>();
    }


    //METODOS
    //Adicionar pessoa a lista
    public void adicionarPessoa(String name, int idade, double altura){
        pessoasList.add(new Pessoa(name, idade, altura));
    }

    //Ordena a lista de pessoas por idade utilizando comparable
    public List<Pessoa> ordenarPorIdade(){
        //Criando uma copia da lista de pessoas
        List<Pessoa> pessoasPorIdadeList = new ArrayList<>(pessoasList);
        //Ordenando a copia por idade
        Collections.sort(pessoasPorIdadeList);
        return pessoasPorIdadeList;

    }

    //Ordena a lista de pessoas por altura
    public List<Pessoa> ordenarPorAltura(){
        //Criando uma copia da lista de pessoas
        List<Pessoa> pessoaPorAlturaList = new ArrayList<>(pessoasList);
        //Ordenando a copia por altura
        Collections.sort(pessoaPorAlturaList, new ComparePorAltura());
        return pessoaPorAlturaList;
    }

}
