package part26;

interface Printable8{
    void print(String s);
}

public class Lambda4 {
    public static void ShowString(Printable8 p, String s){
        p.print(s);
    }

    public static void main(String[]args){
        ShowString((s -> {System.out.println(s);}),"What is Lambda?");
    }
}
