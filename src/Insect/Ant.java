package Insect;

public class Ant extends Insect{
    public void eat() {
        System.out.println("The ant is eating leaves, fruits, seeds, and other insects");

    }
    @Override
    public void collect() {
        System.out.println("Ants collect food, such as leaves, fruits, seeds, and other insects," +
                " for their nourishment and to support their colony. ");
    }
}
