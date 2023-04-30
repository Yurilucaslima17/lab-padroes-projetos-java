package strategy;

public class Robo {
    private IComportamento strategy;

    public void setStrategy(IComportamento strategy) {
        this.strategy = strategy;
    }

    public void mover() {
        strategy.mover();
    }
}
