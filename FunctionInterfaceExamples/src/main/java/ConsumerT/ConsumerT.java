package ConsumerT;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */

public class ConsumerT {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6 , 7 , 8);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(new Consumer<Integer>() {
                    @Override //O metoodo accept, vai fazer oq foi requisitado:
                    // aceita um argumento do tipo T e não retorna nenhum resultado.
                    public void accept(Integer numero) {
                        if (numero % 2 == 0) {
                            System.out.println("Sem Lambda");
                            System.out.println(numero);
                        }
                    }// Essa codificação é do tipo SteamAPI, porém sem o lambda
                });

        // Essa função está em lambida, comparar com a de cima
        numeros.stream().forEach(numero -> {
                    if (numero % 2 == 0) {
                        System.out.println("Com Lambda");
                        System.out.println(numero);
                    }
                }
        );
    }
}
