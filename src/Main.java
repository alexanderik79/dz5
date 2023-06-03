import Insect.Bee;
import Print.OfficePrinter;

public class Main {
    public static void main(String[] args) {
        OfficePrinter officePrinter = new OfficePrinter();
        officePrinter.print();
        Bee bee=new Bee();
        bee.collect();
        bee.eat();
    }
}