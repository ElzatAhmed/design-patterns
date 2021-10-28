package memento;

import memento.game.Gamer;
import memento.game.Memento;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            gamer.bet();
            if(gamer.getMoney() < 50) {
                System.out.println("restoring memento");
                gamer.restoreMemento(memento);
            }
            Thread.sleep(100);
        }
    }

}
