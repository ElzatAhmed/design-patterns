package strategy;

import java.util.Random;

public class WinningStrategy implements Strategy{

    private final Random random;
    private boolean won;
    private Hand prevHand;

    public WinningStrategy() {
        random = new Random();
        won = false;
    }

    @Override
    public Hand nextHand() {
        if(won) return prevHand;
        return Hand.get(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
