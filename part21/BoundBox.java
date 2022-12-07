package part21;
class Box9<T extends Number>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class BoundedBox{
    public static void main(String[]args){
        Box9<Integer> iBox = new Box9<>(); //Integer는 Number를 상속합니다.
        iBox.set(24);

        Box9<Double> dBox = new Box9<>(); //Double은 Number를 상속합니다.
        dBox.set(5.97);

        System.out.println(iBox.get());
        System.out.println(dBox.get());
    }
}
