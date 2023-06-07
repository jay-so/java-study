package part17;

//s사의 흑백 프린터 드라이버
class Prn204Drv implements Printable{
    @Override
    public void print(String doc) {
        System.out.println("From MD - 204 printer");
        System.out.println(doc);
    }
}

//L사의 흑백 프린터 드라이버
class Prn7310Drv implements Printable{
    @Override
    public void print(String doc) {
        System.out.println("From MD - 731 printer");
        System.out.println(doc);
    }
}


public class PrinterDriver2 {
    public static void main(String[] args) {
        String myDoc = "This is a report about....";

        Printable prn = new Prn204Drv();
        prn.print(myDoc);
        System.out.println();

        prn = new Prn7310Drv();
        prn.print(myDoc);
    }
}
