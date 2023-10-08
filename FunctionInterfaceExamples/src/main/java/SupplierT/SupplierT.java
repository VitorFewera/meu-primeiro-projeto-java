package SupplierT;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

public class SupplierT {
    public static void main(String[] args) {
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
                    //não recebe argumento, mas retornar resultado, do mesmo tipo do Supplier

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5).toList();

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
        //Essa expressao System.out::println - faz com que, para cada item que exista na lista,
        // o sistema execute um log especifico.
    }
}
