package part17;

interface Printable4 {
    void print(String doc);
    default void printCMYK(String doc){ };
}
// S사의 흑백 프린터 드라이버
class Prn731Drv2 implements Printable4{
    @Override
    public void print(String doc) {
        System.out.println("From MD-731 printer");
        System.out.println(doc);
    }
}

// L사의 흑백 프린터 드리이버
class Prn99Drv2 implements Printable4{
    @Override
    public void print(String doc) {
        System.out.println("From MD-990 black & white ver");
        System.out.println(doc);
    }

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }
}


public class PrinterDriver4 {
    public static void main(String[]args){
        String myDoc = "This is a report about ...";
        Printable4 prn1 = new Prn731Drv2();
        prn1.print(myDoc);
        System.out.println();

        Printable4 prn2 = new Prn99Drv2();
        prn2.print(myDoc);
    }
}
