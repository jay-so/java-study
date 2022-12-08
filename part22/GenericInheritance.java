package part22;
class Box<T>{
    protected T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class SteelBox<T> extends Box<T>{
    public SteelBox(T o){ //제네릭 클래스의 생성자
        this.ob =o;
    }
}

class GenricInheritance{
    public static void main(String[]args){
        Box<Integer> iBox = new SteelBox<>(7959);
        Box<String> sBox = new SteelBox<>("Simple");
        System.out.println(iBox.get());
        System.out.println(sBox.get());
    }
}
