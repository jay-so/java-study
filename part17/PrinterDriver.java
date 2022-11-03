package part17;

//S사가 정의한 클래스
class SPrinterDriver implements Printable{
    @Override
    public void print(String doc){
        System.out.println("From Samsung printer");
        System.out.println(doc);
    }
}

//L사가 정의한 클래스
class LPrinterDriver implements Printable{
    @Override
    public void print(String doc){
        System.out.println("From LG printer");
        System.out.println(doc);
    }
}

public class PrinterDriver {
    public static void main(String[]args){
        String myDoc = "This is a report about ... ";

        //삼성 프린터로 출력
        Printable prn = new SPrinterDriver();
        prn.print(myDoc);
        System.out.println();

        //LG 프린터로 출력
        prn = new LPrinterDriver();
        prn.print(myDoc);
    }
}
