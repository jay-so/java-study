package part21;

class Box13<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class BoxFactory2{
    public static <T extends Number>Box13<T> makeBox(T o){
        Box13<T> box = new Box13<>();
        box.set(o);

        System.out.println("Boxed data: " + o.intValue());
        return box;
    }
}

class Unboxer2{
    public static <T extends Number> T openBox(Box13<T> box){
        System.out.println("Unboxed data: " + box.get().intValue());
        return box.get();
    }
}

class BoundedGenericMethod{
    public static void main(String[]args){
        Box13<Integer> sBox = BoxFactory2.makeBox(new Integer(5959));
        int n = Unboxer2.openBox(sBox);
        System.out.println("Returned data: " + n);
    }
}