package PilarPOO.src;

public class Carro extends Veiculo {


    public void ligar() {
        ConfereCombustivel();
        ConfereCambio();
        System.out.println("Carro ligado!");
    }

    private void ConfereCombustivel() {
        System.out.println("Conferindo Combustivel!");
    }

    private void ConfereCambio() {
        System.out.println("Conferindo Cambio em P!");
    }

}
