package part26;

interface Printable5{
    void print(String s);
}
public class Lambda2 {
    public static void main(String[]args){
        Printable5 prn = new Printable5() { //익명 클래스
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };

        prn.print("What is Lamda?");
    }
}
