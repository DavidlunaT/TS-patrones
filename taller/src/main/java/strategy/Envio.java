package strategy;

public class Envio {
    IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void enviar() {
        strategy.enviar();
    }
}
