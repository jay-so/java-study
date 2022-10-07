package part21;

class Box3<T>{
    private T ob;
    public void set(T o){
        ob = o;
    }
    public T get(){
        return ob;
    }
}


public class PrimitivesAndGeneric {
    public static void main(String[]args){
        Box3<Integer> iBox = new Box3<Integer>();
        iBox.set(125);
        int num = iBox.get();
        System.out.println(num);
    }
}
