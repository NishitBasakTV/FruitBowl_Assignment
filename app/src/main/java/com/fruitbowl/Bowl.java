package com.fruitbowl;

import java.util.ArrayList;
import java.util.List;

public class Bowl {

    private List<Fruit> fruits;

    public Bowl() {
        this.fruits = new ArrayList<>();
    }
    public Bowl(Fruit fruit) {
        this();
        this.add(fruit);
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public Boolean isBowlEmpty(){
        return this.fruits.isEmpty();
    }
    public boolean add(Fruit fruit){
        return this.fruits.add(fruit);
    }
    public boolean addAll(List<Fruit> fruits){
        return this.fruits.addAll(fruits);
    }
    public boolean remove(Fruit fruit){
        return this.fruits.remove(fruit);
    }
    public void clear(){
        this.fruits.clear();
    }
    public Fruit get(int index){
        return this.fruits.get(index);
    }
    public int size(){
        return this.fruits.size();
    }

}
