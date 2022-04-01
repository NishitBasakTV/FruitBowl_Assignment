package com.fruitbowl;

import java.util.ArrayList;
import java.util.List;

public class MultilayerBasket {
    Bowl allFruitBowl;
    List<Bowl> bowls;

    public MultilayerBasket(Bowl allFruitBowl) {
        this.allFruitBowl = allFruitBowl;
        this.bowls = new ArrayList<>();
    }

    public List<Bowl> getBowls() {
        return bowls;
    }

    public void segregateFruitsByName() {
        Segregator seg = new Segregator();
        this.bowls = seg.byName(bowls, allFruitBowl);
    }

    public void segregateFruitsByColour() {
        Segregator seg = new Segregator();
        this.bowls = seg.byColour(bowls, allFruitBowl);
    }

    public void segregateFruitsByType() {
        Segregator seg = new Segregator();
        this.bowls = seg.byType(bowls, allFruitBowl);
    }

    public void segregateFruitsBySize() {
        Segregator seg = new Segregator();
        this.bowls = seg.bySize(bowls, allFruitBowl);
    }

}
