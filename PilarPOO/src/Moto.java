package PilarPOO.src;

public class Moto extends Veiculo {
    private void ConfereCombustivel() {
        System.out.println("Conferindo Combustivel!");
    }

    private void ConfereCambio() {
        System.out.println("Conferindo Cambio em P!");
    }

    @Override
    public void ligar() {
        ConfereCambio();
        ConfereCombustivel();
        System.out.println("ligado");
    }
}
