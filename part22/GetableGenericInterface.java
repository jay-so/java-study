package part22;

interface Getable<T>{
    public T get();
}

//인터페이스 Getable<T>를 구현하는 Box10<T> 클래스
class Box10<T> implements Getable<T>{
    private T ob;

    @Override
    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class Toy6{
    @Override
    public String toString(){
        return "I am a Toy";
    }
}

public class GetableGenericInterface {
    public static void main(String[]args){
        Box10<Toy6> box =new Box10<>();
        box.set(new Toy6());

        //Box<T>가 Getable<T>를 구현하므로 참조 가능
        Getable<Toy6> gt = box;
        System.out.println(gt.get());
    }
}
