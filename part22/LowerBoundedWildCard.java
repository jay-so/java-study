package part22;

class Box4<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }

    @Override
    public String toString(){
        return ob.toString();
    }
}

class Unboxer4{
    public static void peekBox(Box4<? super Integer> box){
        System.out.println(box);
    }
}

public class LowerBoundedWildCard {
    public static void main(String[]args){
        Box4<Integer> iBox = new Box4<Integer>();
        iBox.set(5577);

        Box4<Number> nBox = new Box4<>();
        nBox.set(new Integer(9955));

        Box4<Object> oBox = new Box4<>();
        oBox.set("My Simple Instance");

        Unboxer4.peekBox(iBox);
        Unboxer4.peekBox(nBox);
        Unboxer4.peekBox(oBox);
    }
}
