package part22;

class Box7<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class Toy3{
    @Override
    public String toString(){
        return "I am a Toy";
    }
}

class BoxHandler3{
    public static void outBox(Box7<? extends Toy3> box){
        Toy3 t = box.get(); //상자에서 꺼내기
        System.out.println(t);
    }
    public static void inBox(Box7<? super Toy3> box,Toy3 n){
        box.set(n); //상자에 넣기
    }
}

public class BoundedWildcardUsage2 {
    public static void main(String[]args){
        Box7<Toy3> box = new Box7<>();
        BoxHandler3.inBox(box, new Toy3());
        BoxHandler3.outBox(box);
    }
}
