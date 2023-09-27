
public class MinhaClase {
    
    //Metodo principal de execução dentro do java 
    public static void main (String [] args){
        System.out.print("Ola mundo!");

    //Declarando variavel
    final String BR = "Brasil"; //Não sobre alteração
    //BR = "Brazil";

    int ano = 2022; // pode sofrer alteração
    ano = 2023;

    //Variaavel sempre declarada como Tipo variavel = valor;
    String meuNome = "vitor";

    int anoFabricacao = 2022;

    boolean verdade = true;


    String primeiroNome = "Vitor";
    String segundoNome = "Hugo";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);


    }
    // Criando metodos public static tipo nomeMetodo(parmetros) {codigo}
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
        
    /*public static int somar (int num1,int num2){
        return 
    }*/




