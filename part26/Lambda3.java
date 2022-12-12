package part26;


interface Printable7{ //추상 메소드가 하나인 인터페이스
    void print(String s);
}

public class Lambda3 {
    public static void main(String[]args){
        Printable7 prn = (s -> {System.out.println(s);});
        prn.print("What is Lambda?");
    }
}
