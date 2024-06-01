package org.example;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private final String breadType;
    private final String meatType;
    private final String cheeseType;
    private final List<String> vegetables;
    private final boolean hasMayo;
    public boolean hasMustard;

    private Sandwich(SandwichBuilder builder) {
        this.breadType = builder.breadType;
        this.meatType = builder.meatType;
        this.cheeseType = builder.cheeseType;
        this.vegetables = builder.vegetables;
        this.hasMayo = builder.hasMayo;
        this.hasMustard = builder.hasMustard;
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public String getCheeseType() {
        return cheeseType;
    }

    public List<String> getVegetables() {
        return vegetables;
    }

    public boolean isHasMayo() {
        return hasMayo;
    }

    public boolean isHasMustard() {
        return hasMustard;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType='" + breadType + '\'' +
                ", meatType='" + meatType + '\'' +
                ", cheeseType='" + cheeseType + '\'' +
                ", vegetables=" + vegetables +
                ", hasMayo=" + hasMayo +
                ", hasMustard=" + hasMustard +
                '}';
    }

    public static class SandwichBuilder {
        private final String breadType;
        private final String meatType;
        private String cheeseType;
        private final List<String> vegetables = new ArrayList<>();
        private boolean hasMayo;
        private boolean hasMustard;

        public SandwichBuilder(String breadType, String meatType) {
            this.breadType = breadType;
            this.meatType = meatType;
        }

        public SandwichBuilder setCheeseType(String cheeseType) {
            this.cheeseType = cheeseType;
            return this;
        }

        public SandwichBuilder addVegetable(String vegetable) {
            this.vegetables.add(vegetable);
            return this;
        }

        public SandwichBuilder setHasMayo(boolean hasMayo) {
            this.hasMayo = hasMayo;
            return this;
        }

        public SandwichBuilder setHasMustard(boolean hasMustard) {
            this.hasMustard = hasMustard;
            return this;
        }

        public Sandwich build() {
            return new Sandwich(this);
        }
    }
}
