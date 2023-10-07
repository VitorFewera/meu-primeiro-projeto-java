package PilarPOO.src;

public class Autrodomo {

    //Encapsulamento
    public static void main(String[] args) throws Exception {
        Carro jeep = new Carro();
        jeep.ligar();
        // Encapsulamento = Usar o private, para esconder algumas ações,
        // que nao são importantes ficarem visiveis a todo o projeto

        //herança
        jeep.setChassi("1233");
        jeep.ligar();

        Moto suzuki = new Moto();
        suzuki.setChassi("3321");
        //Herança nada mais é do que criar classes mais genericas, para criar classes mais especificas
        //que vao herdar da mais generica, ex: as classes carro e moto que herdam de veiculo o atribuot chassi


        suzuki.ligar();

        Veiculo teste = jeep;

        teste.ligar();


    }
}
