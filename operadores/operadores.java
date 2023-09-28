package operadores;

public class operadores {

    public static void main(String[] args) {
        /* Operador + para String */
        String arg1 = "Vitor";
        String arg2 = "Hugo";
        String juncao = arg1 + arg2;
        System.out.println(juncao);

        // Para concatenação
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao); // 31 - somou os 3 primeiros e juntos o texto

        concatenacao = 1 + 1 + "1" + 1; // 211 - somou os dois primeiros e colocou o restante em texto
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1; // 1111 - não houve soma, tudo texto
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + (1 + 1); // 112 - houve a soma da evidencia, e depois texto
        System.out.println(concatenacao);

        // Metodo para comparar conteudos
        String nome1 = "vitor";
        String nome2 = "vitor";

        System.out.println(nome1.equals(nome2));
        // Quando coloco o equals, ele automaticamente, pega a varial apontada, é igual
        // a variavel que ta no ()
    }

}
