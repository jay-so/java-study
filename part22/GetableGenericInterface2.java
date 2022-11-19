package part22;

interface Getable2<T>{
    public T get();
}

class Box11<T> implements Getable2<String>{
    private T ob;
    public void set(T o){
        ob = o;
    }

    @Override
    public String get(){ //반환형은 T가 아닌 String이어야 한다.
        return ob.toString();
    }
}

class Toy7{
    @Override
    public String toString(){
        return "I am a Toy";
    }
}

public class GetableGenericInterface2 {
    public static void main(String[]args){
        Box11<Toy7> box = new Box11<>();
        box.set(new Toy7());

        Getable2<String> gt = box;
        System.out.println(gt.get());
    }
}
