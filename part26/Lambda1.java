package part26;

interface Printable4{
    void print(String s);
}

class Printer implements Printable4{
    @Override
    public void print(String s){
        System.out.println(s);
    }
}


public class Lambda1 {
    public static void main(String[]args){
        Printable4 prn = new Printer();
        prn.print("What is Lamda?");
    }
}
