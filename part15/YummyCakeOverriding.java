package part15;

class Cake{
    public void yummy(){
        System.out.println("Yummy Cake");
    }
}

class CheeseCake extends Cake{
    @Override
    public void yummy() {
        super.yummy();
        System.out.println("Yummy Cheese Cake");
    }

    public void tasty(){
        super.yummy();
        System.out.println("Yumy Tasty Cake");
    }
}

public class YummyCakeOverriding {
    public static void main(String[]args){
        Cake c1 = new CheeseCake();
        CheeseCake c2 = new CheeseCake();

        c1.yummy();
        c2.yummy();
    }
}
