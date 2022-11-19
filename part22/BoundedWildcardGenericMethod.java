package part22;

class Box9<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class Toy5{
    @Override
    public String toString(){
        return "I am a Toy";
    }
}

class Robot{
    @Override
    public String toString(){
        return "I am a Robot";
    }
}

class BoxHandler4{
    public static <T> void outBox(Box9<? extends T>box){
        T t = box.get();
        System.out.println(t);
    }

    public static <T> void inBox(Box9<? super T> box, T n){
        box.set(n);
    }
}

public class BoundedWildcardGenericMethod {
    public static void main(String[]args){
        Box9<Toy5> tBox = new Box9<>();
        BoxHandler4.inBox(tBox,new Toy5());
        BoxHandler4.outBox(tBox);
        Box9<Robot> rBox = new Box9<>();
        BoxHandler4.inBox(rBox,new Robot());
        BoxHandler4.outBox(rBox);
    }
}
