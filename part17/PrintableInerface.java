package part17;

// MS가 정의하고 제공한 인터페이스
interface Printable{
    public void print(String doc); // 흑백 출력을 위한 추상 메소드
}

// Printable을 구현하는 Printer 클래스
class Printer implements Printable{
    //오버라이딩 관계 성립
    @Override
    public void print(String doc){
        System.out.println(doc);
    }
}

public class PrintableInerface {
    public static void main(String []args){
        // Printable형 참조변수 선언 가능
        Printable prn = new Printer();
        prn.print("Hello Java");
    }
}
