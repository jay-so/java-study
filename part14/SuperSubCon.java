package part14;

class SuperCLS{
    public SuperCLS() {
        System.out.println("I'm Super Class");
    }
}


public class SuperSubCon extends SuperCLS{
    public static void main(String[]args){
        new SuperCLS();
    }
}
