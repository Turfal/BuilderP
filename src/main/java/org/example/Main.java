package org.example;

import org.example.Sandwich;

public class Main {
    public static void main(String[] args) {
        Sandwich mySandwich = new Sandwich.SandwichBuilder("wheat", "turkey")
                .setCheeseType("cheddar")
                .addVegetable("lettuce")
                .addVegetable("tomato")
                .setHasMayo(true)
                .setHasMustard(false)
                .build();

        System.out.println(mySandwich);
    }
}
