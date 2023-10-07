package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    //O hashSet<> tem o mesmmo sentido do List<>, é um metodo para evidenciar o tipo Set
    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    //adicionando item no set
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    //removendo item do set
    public void removerConvidadePorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
            else
            {
                System.out.println("Não encotrado o convido com esse codigo de convite: "+c);
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1 ", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 1 ", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 1 ", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 1 ", 1236);

        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadePorCodigoConvite(1234);
        System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }

}
