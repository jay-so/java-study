package part22;

class Box5<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class Toy{
    @Override
    public String toString(){
        return "I am a Toy";
    }
}

class BoxHandler{
    public static void outBox(Box5<Toy> box){
        Toy t = box.get();
        System.out.println(t);
    }
    public static void inBox(Box5<Toy>box, Toy n){
        box.set(n); //상자에 넣기
    }
}

public class BoundedWildcardBase {
    public static void main(String[]args){
        Box5<Toy> box = new Box5<>();
        BoxHandler.inBox(box,new Toy());
        BoxHandler.outBox(box);
    }
}
