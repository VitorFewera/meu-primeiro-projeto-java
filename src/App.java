
public class App {
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolcitado = 17.0;
        //estrutura
        if(valorSolcitado < saldo){
            saldo = saldo - valorSolcitado;
            System.out.println(saldo);
        }
        else{
            System.out.println("erro");
        }

        //ternario

        double nota = 8;

        String resultado = nota > 7 || nota == 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);


        

    }
}
