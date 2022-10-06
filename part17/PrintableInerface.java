package part17;

interface Printable{
    public void print(String doc);
}

class Printer implements Printable{
    @Override
    public void print(String doc){
        System.out.println(doc);
    }
}

public class PrintableInerface {
    public static void main(String []args){
        Printable prn = new Printer();
        prn.print("Hello Java");
    }
}
