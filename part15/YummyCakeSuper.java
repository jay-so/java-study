package part15;
class Cake3 {
    public void yummy() {
        System.out.println("Yummy Cake");
    }
}

class CheeseCake3 extends Cake3 {

    public void yummy() {
        super.yummy(); //Cake3의 yummy 메소드 호출
        System.out.println("Yummy CheeseCake");
    }
    public void tasty() {
        super.yummy(); // Cake3의 yummy 메소드 호출
        System.out.println("Yummy Tasty Cake");
    }
}


public class YummyCakeSuper {
    public static void main(String[]args){
        CheeseCake3 cake = new CheeseCake3();
        cake.yummy();
        cake.tasty();

    }
}
