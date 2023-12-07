package strategy;

public class Fluvial implements IStrategy {
    public String tipoEnvio;

    public Fluvial(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public void enviar() {
        System.out.println("Enviando por Fluvial");
    }
}
