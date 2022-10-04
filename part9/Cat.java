package part9;

    /*
    Duck은 default로 선언되었으므로 동일 패키지 내에서만 인스턴스 생성 가능
     */
class Duck{
    // 빈 클래스
    }


public class Cat {
    public void makCat(){
        //Duck과 같은 패키지로 묶여 있으니 Duck 인스턴스 생성 가능
        Duck quack= new Duck();
    }
}
