package part17;

interface Printable3{
    void printLine(String str);
}

// Printable을 직접 구현함
class SimplePrinter2 implements Printable3{
    @Override
    public void printLine(String str) {
        System.out.println(str);
    }
}

//Printable을 간접 구현함
class MultiPrinter extends SimplePrinter2{
    public void printLine(String str){
        super.printLine("stat of multil...");
        super.printLine(str);
        super.printLine("end of multi");
    }
}

public class InstanceofInterface {
    public static void main(String[]args){
        Printable3 prn1 = new SimplePrinter2();
        Printable3 prn2 = new MultiPrinter();

        if(prn1 instanceof Printable3)
            prn1.printLine("This is a simple printer.");
        System.out.println();

        if(prn2 instanceof Printable3)
            prn2.printLine("This is a muliful printer.");
    }
}
