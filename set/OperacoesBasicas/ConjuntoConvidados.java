package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    

    //ATRIBUTOS
    private Set<Convidado> convidadoSet;


    //CONSTRUTOR
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }


    //METODOS
    //Adiciona convidado ao conjunto
    public void adicionarConvidado (String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    //Remove convidado do conjunto com base no codigo de convite
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadeParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadeParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadeParaRemover);
    }

    //Conta o numero de convidados no conjunto
    public int contarConvidados(){
        return convidadoSet.size();
    }


    //Exibe os convidados do conjunto
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }



}
