package strategy;

public class Automotriz implements IStrategy {
    public String tipoEnvio;

    public Automotriz(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public void enviar() {
        System.out.println("Enviando por Automotriz");
    }
}
