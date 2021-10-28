package memento.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {

    int money;
    List<String> fruits;

    Memento(int money){
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruit(String fruit){
        fruits.add(fruit);
    }

    List<String> getFruits(){
        return new ArrayList<>(fruits);
    }

}
