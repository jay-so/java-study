package part17;

interface Printable2 {
    static void printLine(String str){
        System.out.println(str);
    }
    default void print(String doc){
        printLine(doc);
    }
}
class Printer2 implements Printable2{}


public class SimplePrinter {
    public static void main(String[]args){
        String myDoc = "This is a report about...";
        Printable prn = new Printer();
        prn.print(myDoc);

        Printable2.printLine("end of line");
    }
}
