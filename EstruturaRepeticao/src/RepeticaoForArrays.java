public class RepeticaoForArrays {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("Aluno no indice x = " + " é " + alunos[x]);
        }

        /* Forma abreviada */
        for (String aluno : alunos) {
            System.out.println("Aluno no indice x = " + aluno);
        }


    }
}
