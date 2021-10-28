package memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {

    private int money;
    private List<String> fruits;
    private Random random;
    private static String[] fruitNames = {
            "a", "b", "c", "d", "e", "f"
    };

    public Gamer(int money){
        this.money = money;
        fruits = new ArrayList<>();
        random = new Random();
    }

    public int getMoney() {
        return money;
    }

    public void bet(){
        int dice = random.nextInt(6) + 1;
        switch (dice){
            case 1:
                money += 100;
                System.out.println("money increased");
                break;
            case 2:
                money /= 2;
                System.out.println("money decreased to half");
            case 6:
                String fruit = getFruit();
                fruits.add(fruit);
                System.out.println("got fruit " + fruit);
                break;
            default:
                System.out.println("nothing happened");
        }
    }

    public Memento createMemento(){
        Memento memento = new Memento(getMoney());
        memento.fruits.addAll(fruits);
        return memento;
    }

    public void restoreMemento(Memento memento){
        money = memento.money;
        fruits = memento.getFruits();
    }

    private String getFruit(){
        return Gamer.fruitNames[random.nextInt(fruitNames.length)];
    }
}
