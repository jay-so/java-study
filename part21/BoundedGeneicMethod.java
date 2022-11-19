package part21;

class Box10<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class BoxFactory2{
    public static <T extends  Number> Box10<T> makBox(T o){
        Box10<T> box = new Box10<T>();
        box.set(o);

        System.out.println("Boxed data: " + o.intValue());
        return box;
    }
}

class Unboxer2{
    public static <T extends  Number> T openBox(Box10<T> box){
        System.out.println("Unboxed data: " + box.get().intValue());
        return  box.get();
    }
}

public class BoundedGeneicMethod {
    public static void main(String[]args){
        Box10<Integer> sBox = BoxFactory2.makBox(new Integer(5959));
        int n = Unboxer2.openBox(sBox);
        System.out.println("Returned data: " + n);
    }
}
