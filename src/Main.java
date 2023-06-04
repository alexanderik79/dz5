import Insect.Ant;
import Insect.Bee;
import Print.OfficePrinter;

public class Main {
    public static void main(String[] args) {
        OfficePrinter officePrinter = new OfficePrinter();
        officePrinter.print();
        Bee bee=new Bee();
        bee.collect();
        bee.eat();
        Ant ant = new Ant();
        ant.collect();
        ant.eat();
        System.out.println("This git make me angry");

        // Пацаган
        Bee bee1=new Bee();
        bee1.collect();
        bee1.eat();
        System.out.println("it can confuse");
    }
}