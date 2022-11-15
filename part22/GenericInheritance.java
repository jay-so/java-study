package part22;

class Box<T>{
    protected T ob;
    public void set(T o){ ob = o;}
    public T get(){ return ob;}

    @Override
    public String toString(){
        return ob.toString();
    }
}

class StellBox<T> extends Box<T>{
    public StellBox(T o){ //제네릭 클래스의 생성자
        ob = o;
    }
}

public class GenericInheritance {
    public static void main(String[]args){
        Box<Integer> iBox = new StellBox<>(7959);
        Box<String> sBox = new StellBox<>("Simple");
        System.out.println(iBox.get());
        System.out.println(sBox.get());
    }
}
