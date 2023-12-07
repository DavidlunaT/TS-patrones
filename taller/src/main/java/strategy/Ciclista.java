package strategy;

public class Ciclista implements IStrategy {
    public String tipoEnvio;

    public Ciclista(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public void enviar() {
        System.out.println("Enviando por Ciclista");
    }
}
