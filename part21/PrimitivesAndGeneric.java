package part21;
class Box7<T> {
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}
class PrimitivesAndGenric{
    public static void main(String[]args){
        Box7<Integer> iBox = new Box7<>();
        iBox.set(125); //오토 박싱
        int num = iBox.get(); //오토 언박싱
        System.out.println(num);
    }
}