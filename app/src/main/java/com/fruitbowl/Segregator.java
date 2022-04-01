package com.fruitbowl;

import java.util.List;

public class Segregator {

    public List<Bowl> byName(List<Bowl> bowls, Bowl allFruitBowl) {
        for (Fruit fruit : allFruitBowl.getFruits()) {
            boolean isSegregated = false;
            for (Bowl bowl : bowls) {
                if (bowl.get(0).getName().equals(fruit.getName())) {
                    bowl.add(fruit);
                    isSegregated = true;
                    break;
                }
            }
            if (!isSegregated) {
                Bowl bowl = new Bowl(fruit);
                bowls.add(bowl);
            }
        }
        return bowls;
    }


    public List<Bowl> byColour(List<Bowl> bowls, Bowl allFruitBowl) {
        for (Fruit fruit : allFruitBowl.getFruits()) {
            boolean isSegregated = false;
            for (Bowl bowl : bowls) {
                if (bowl.get(0).getColour().equals(fruit.getColour())) {
                    bowl.add(fruit);
                    isSegregated = true;
                    break;
                }
            }
            if (!isSegregated) {
                Bowl bowl = new Bowl(fruit);
                bowls.add(bowl);
            }
        }
        return bowls;
    }

    public List<Bowl> byType(List<Bowl> bowls, Bowl allFruitBowl) {
        for (Fruit fruit : allFruitBowl.getFruits()) {
            boolean isSegregated = false;
            for (Bowl bowl : bowls) {
                if (bowl.get(0).getType().equals(fruit.getType())) {
                    bowl.add(fruit);
                    isSegregated = true;
                    break;
                }
            }
            if (!isSegregated) {
                Bowl bowl = new Bowl(fruit);
                bowls.add(bowl);
            }
        }
        return bowls;
    }

    public List<Bowl> bySize(List<Bowl> bowls, Bowl allFruitBowl) {
        for (Fruit fruit : allFruitBowl.getFruits()) {
            boolean isSegregated = false;
            for (Bowl bowl : bowls) {
                if (bowl.get(0).getSize().equals(fruit.getSize())) {
                    bowl.add(fruit);
                    isSegregated = true;
                    break;
                }
            }
            if (!isSegregated) {
                Bowl bowl = new Bowl(fruit);
                bowls.add(bowl);
            }
        }
        return bowls;
    }
}