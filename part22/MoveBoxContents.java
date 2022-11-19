package part22;

class Box8<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class Toy4{
    @Override
    public String toString(){
        return "I am a Toy";
    }
}

class BoxContentsMover{
    //from에 저장된 내용물을 to로 이동
    public static void moveBox(Box8<? super Toy4>to,Box8<? extends Toy4> from){
        to.set(from.get());
    }
}

public class MoveBoxContents {
    public static void main(String[]args){
        Box8<Toy4> box1 = new Box8<>();
        box1.set(new Toy4());
        Box8<Toy4> box2 = new Box8<>();

        //box1에 저장된 내용물 box2로 이동
        BoxContentsMover.moveBox(box2,box1);
        System.out.println(box2.get());
    }
}
