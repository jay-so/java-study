package part9;

public class Dog {
    public void makeCat(){
        //Cat은 public으로 선언되었으므로 어디서든 인스턴스 생성 가능
        Cat yang = new Cat();
    }

    public void makeDuck(){
        Duck quack = new Duck();
    }
}
