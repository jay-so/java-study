package part17;

interface ColorPrintable extends Printable{
    void printCMK(String doc);
}

class Prn909Drv implements ColorPrintable{
    @Override
    public void printCMK(String doc) {
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("From MD 909 CMK ver");
        System.out.println(doc);
    }
}

public class PrintDriver3 {
    public static void main(String[]args){
        String myDoc = "This is a report about ...";
        ColorPrintable prn = new Prn909Drv();
        prn.print(myDoc);
        System.out.println();
        prn.printCMK(myDoc);
    }
}
