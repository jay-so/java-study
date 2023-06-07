package part17;

interface Printable2{
    static void printLine(String str){
        System.out.println(str);
    }
    default void print(String doc){
        printLine(doc); //인터페이스의 static 메소드 호출
    }
}

 // 인터페이스 Printable2에는 구현해야 할 메소드가 존재하지 않는다.
class Printer2 implements Printable2{}


public class SimplePrinter {
    public static void main(String[]args){
        String myDoc = "This is a report about...";
        Printable2 prn = new Printer2();
        prn.print(myDoc);

        // 인터페이스의 static 메소드 직접 호출
        Printable2.printLine("end of line");
    }
}
