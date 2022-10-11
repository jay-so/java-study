package part21;

class Box4<T extends Number>{
    private  T ob;

    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}

public class BoundBox {
    public static void main(String[]args){
        Box4<Integer> iBox = new Box4<>();
        iBox.set(24);

        Box<Double> dBox = new Box<>();
        dBox.set(5.97);

        System.out.println(iBox.get());
        System.out.println(dBox.get());
    }
}