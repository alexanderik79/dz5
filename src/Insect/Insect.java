package Insect;

import interfaces.Collectable;

public  abstract class Insect implements Collectable {

    public void eat() {
        System.out.println("The insect is eating.");
    }

}
