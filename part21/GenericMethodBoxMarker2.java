package part21;
class Box12<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}
class Unboxer{
    public static <T> T openBox(Box12<T> box){
        return box.get();
    }
}
class GenericMethodBoxMaker2{
    public static void main(String[]args){
        Box12<String> box = new Box12<>();
        box.set("My Generic Method");

        String str = Unboxer.<String>openBox(box);
        System.out.println(str);
    }
}
