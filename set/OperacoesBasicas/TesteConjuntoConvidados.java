package set.OperacoesBasicas;

public class TesteConjuntoConvidados {
    public static void main(String[] args) {
        

        //Inserindo convidados no conjunto
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("RENAN", 1);
        conjuntoConvidados.adicionarConvidado("DANIELA", 2);
        conjuntoConvidados.adicionarConvidado("CAIO", 3);
        conjuntoConvidados.adicionarConvidado("TAINARA", 3);
        conjuntoConvidados.adicionarConvidado("MARIZA", 4);
        conjuntoConvidados.adicionarConvidado("MARCOS", 5);
        conjuntoConvidados.adicionarConvidado("KYRA", 6);

        //Imprimindo lista de convidados
        conjuntoConvidados.exibirConvidados();

        //Contar convidados
        System.out.println("Numero de convidados: "+ conjuntoConvidados.contarConvidados());

        //Removendo convidado
        conjuntoConvidados.removerConvidadoPorCodigoConvite(6);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Numero de convidados: "+ conjuntoConvidados.contarConvidados());

    }
}
