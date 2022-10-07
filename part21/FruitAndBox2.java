package part21;

class Box2<T>{
    private Object ob;

    public void set(Object o){
        ob = o;
    }
    public Object get(){
        return ob;
    }
}

public class FruitAndBox2 {
    public static void main(String[]args){
        Box2<Apple> aBox = new Box2<Apple>();
        Box2<Orange> oBox = new Box2<Orange>();

        aBox.set(new Apple());
        oBox.set(new Orange());

        Apple ap = (Apple)aBox.get();
        Orange og = (Orange)oBox.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
