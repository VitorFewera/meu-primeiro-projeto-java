import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            // criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            // imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        }
        /*Depois de feito o codigo, se identifica um provavel erro, e procura o metodo que podera apresentar o erro. Como o 
            mesmo estaria no metodo InputMismatchException, defini uma variavel a ele, (e) e apresentei em meu log.
            Sempre que esse erro acontecer, o log abaixo sera executado.  
        */ catch (InputMismatchException e) {
            System.out.println("O campos de idade e altura, precisam ser numericos " + e);
        }

    }
}