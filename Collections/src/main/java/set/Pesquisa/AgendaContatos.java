package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;


    public AgendaContatos() {
        contatoSet = new HashSet<>();
    }

    //Adicionar contato
    public void adicionarContatos(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            //startsWith(String) - metodo para retornar todos os dados que começem com a string passada
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            //Se ele encontra um nome exatamente igual ao passado, ele atualiza, para o loop e retorna o atualizado
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        // Criando uma instância da classe AgendaContatos
        AgendaContatos agendaContatos = new AgendaContatos();

        // Exibindo os contatos no conjunto (deve estar vazio)
        agendaContatos.exibirContato();

        // Adicionando contatos à agenda
        agendaContatos.adicionarContatos("João", 123456789);
        agendaContatos.adicionarContatos("Maria", 987654321);
        agendaContatos.adicionarContatos("Maria Fernandes", 55555555);
        agendaContatos.adicionarContatos("Ana", 88889999);
        agendaContatos.adicionarContatos("Fernando", 77778888);
        agendaContatos.adicionarContatos("Carolina", 55555555);

        // Exibindo os contatos na agenda
        agendaContatos.exibirContato();

        // Pesquisando contatos pelo nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContato();
    }
}