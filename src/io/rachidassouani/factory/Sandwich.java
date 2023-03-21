package io.rachidassouani.factory;
public class Sandwich {
    private String name;
    private int calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void prepareSandwich() {
        System.out.println("the sandwich " + name + " has "+calories);
    }
}
