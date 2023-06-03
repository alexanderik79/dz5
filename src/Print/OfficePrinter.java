package Print;

public class OfficePrinter extends Printer {
    @Override
    public void print() {
        super.print();
        System.out.println("i can make copies");
    }
}
