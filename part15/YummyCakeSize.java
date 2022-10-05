package part15;

class Cake2{
    public int size;

    public Cake2(int sz) {
        this.size = sz;
    }
    public void showCakeSize(){
        System.out.println("Bread Ounces: " + size);
    }
}

class  CheeseCake2 extends Cake2{
    public int size;

    public CheeseCake2(int sz, int size) {
        super(sz);
        this.size = size;
    }
    public void showCakeSize(){
        System.out.println("Bread Ounces: " + super.size);
        System.out.println("Cheese Ounces: " + size);
    }
}

public class YummyCakeSize {
    public static void main(String[]args){
        CheeseCake2 ca1 = new CheeseCake2(5,7);
        Cake2 ca2 = ca1;

        System.out.println("Bread Ounces: " + ca2.size);

        System.out.println("Cheese Ounces: " + ca1.size);
        System.out.println();

        ca1.showCakeSize();
        System.out.println();
        ca2.showCakeSize();
    }
}
