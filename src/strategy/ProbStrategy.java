package strategy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProbStrategy implements Strategy{

    private Map<Hand, Integer> map;
    private Hand curHand;

    public ProbStrategy() {
        map = new HashMap<>();
    }

    @Override
    public Hand nextHand() {
        Iterator<Hand> iterator = map.keySet().iterator();
        int maxCount = 0;
        Hand maxHand = null;
        while (iterator.hasNext()){
            Hand hand = iterator.next();
            Integer count = map.get(hand);
            if(count > maxCount) {
                maxCount = count;
                maxHand = hand;
            }
        }
        return maxHand;
    }

    @Override
    public void study(boolean win) {
        if (win){
            Integer i = map.get(curHand);
            map.remove(curHand);
            map.put(curHand, i + 1);
        }
    }
}
