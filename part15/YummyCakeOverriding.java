package part15;

class Cake{
    public void yummy(){
        System.out.println("Yummy Cake");
    }
}

class CheeseCake extends Cake{
    @Override
    public void yummy() { // Cake의 yummy 메소드를 오벼라이딩 함
        System.out.println("Yummy Cheese Cake");
    }

    public void tasty(){
        super.yummy();
        System.out.println("Yumy Tasty Cake");
    }
}

public class YummyCakeOverriding {
    public static void main(String[]args){
        Cake c1 = new CheeseCake(); // 오버라이딩 한 CheeseCake의 yummy 메소드 호출됨
        CheeseCake c2 = new CheeseCake(); // 오버라이딩 한 CheeseCake의 yummy 메소드 호출됨

        c1.yummy();
        c2.yummy();
    }
}
