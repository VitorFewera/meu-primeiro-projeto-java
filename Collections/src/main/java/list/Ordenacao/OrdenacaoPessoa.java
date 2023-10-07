package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> pessoaPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);//essa é a lista em si
        //o metodo .sort, vai executar a função de ordenar pessoas, por idade, função que vem Comparable
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatoPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("nome 2", 30, 1.56);
        ordenacaoPessoa.adicionarPessoa("nome 3", 25, 1.56);
        ordenacaoPessoa.adicionarPessoa("nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoa.pessoaPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

class ComparatoPorAltura implements Comparator<Pessoa> {

    //metodo que é aplicado quando o Comparator é utilizado
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}