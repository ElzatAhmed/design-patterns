package strategy;

public class Player {

    private Strategy strategy;

    public Player(Strategy strategy) {
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win(){
        strategy.study(true);
    }

    public void lose(){
        strategy.study(false);
    }

    public void even(){
        strategy.study(true);
    }
}
