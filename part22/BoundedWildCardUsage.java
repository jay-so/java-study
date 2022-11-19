package part22;

class Box6<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class Toy2{
    @Override
    public String toString(){
        return "I am a Toy";
    }
}

class BoxHandelr2{
    public static void outBox(Box6<? extends Toy2> box){
        Toy2 t = box.get(); //상자에서 꺼내기
        System.out.println(t);
    }
    public static void inBox(Box6<Toy2> box, Toy2 n){
        box.set(n); //상자에 넣기
    }
}

public class BoundedWildCardUsage {
    public static void main(String[]args){
        Box6<Toy2> box = new Box6<>();
        BoxHandelr2.inBox(box,new Toy2());
        BoxHandelr2.outBox(box);
    }
}
