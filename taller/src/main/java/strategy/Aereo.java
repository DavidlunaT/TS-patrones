package strategy;

public class Aereo implements IStrategy {
    public String tipoEnvio;

    public Aereo(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public void enviar() {
        System.out.println("Enviando por Aereo");
    }
}
