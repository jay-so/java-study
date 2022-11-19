package part21;

class Box9<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class Unboxer{
    public static <T> T openBox(Box8<T> box){
        return box.get();
    }
}

public class GenericMethodBoxMarker2 {
    public static void main(String[]args){
        Box8<String> box = new Box8<>();
        box.set("My Generic Method");

        String str = Unboxer.<String>openBox(box);
        System.out.println(str);
    }
}
