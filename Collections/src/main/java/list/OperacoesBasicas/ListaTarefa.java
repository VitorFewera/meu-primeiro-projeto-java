package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    /* o metodo abaixo é utilizado para adicioanr um item ao List, ele recebe um parametro do tipo String, e passa a
    variavel tarefaList, e adiconar o metodo add. Logo o tarefaList.add, vai adicionar uma tarefa, que esta sendo insta
    ciada na parte (new Tarefa(descricao)); - mostrando que a tarefa sera do tipo Tarefa, e fica na variavel descricao
     */
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    /* Esse metodo realiza a remoção da tarefa em si. Ele entao recebe uma String descricao, para atuar na remoção, e
    em seguida cria uma nova varial que se parametrizara no ArrayList;
    Depois, ela cria um for, que sera ativado sempre que encotra uma tarefa, que seja igual, a que sera informada no
    comando. t = variavel.getDescricao() = que pega o get da descricao da tarefa.equalsIgnoreCase(variavel) = que faz
    com que compare a informação da variavel checada, com a que é apresentada.
    Se for tudo ok, ele executa o metodo add, para adiocioar essa variavel a lista em questão, para no fim, executar um
    removeAll, que apagara toda a lista de tarefas relacionada.
     */
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    /*Esse metodo, cria um metodo do tipo inteiro, não passa nenhum parametro, e retona a lista de tarefa tarefaList
    e aplica um metodo que mostra os itens que existem na lista, que seria o.size()
     */
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    //Aqui apenas imprime a lista de tarefas tarefaList
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        //testando obterNumeroTotalTarefas
        System.out.println("o numero de elementos da lista é " + listaTarefa.obterNumeroTotalTarefas());

        //testando adicionarTarefa
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        listaTarefa.adicionarTarefa("tarefa 2");
        //verificando se foi adicionada
        System.out.println("o numero de elementos da lista é " + listaTarefa.obterNumeroTotalTarefas());

        //testando removerTarefa
        listaTarefa.removerTarefa("tarefa 2");
        //verificando se foi removida
        System.out.println("o numero de elementos da lista é " + listaTarefa.obterNumeroTotalTarefas());

        //testando imprimir tarefa
        listaTarefa.obterDescricoesTarefas();
    }
}
