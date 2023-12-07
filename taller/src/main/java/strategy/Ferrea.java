package strategy;

public class Ferrea implements IStrategy{
    public String tipoEnvio;

    public Ferrea(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public void enviar() {
        System.out.println("Enviando por Ferrea");
    }
}
