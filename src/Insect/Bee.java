package Insect;

public class Bee extends Insect {
    public void eat() {
        System.out.println("The bee is eating honey");

    }

    @Override
    public void collectNectar() {
        System.out.println("The honey bee is collecting nectar from flowers");
    }
}
