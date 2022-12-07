package part21;
class Box11<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class BoxFactory{
    public static <T> Box11<T> makeBox(T o){ //제네릭 메소드를 정의
        Box11<T> box = new Box11<>(); //상자를 생성하고
        box.set(o); //전달된 인스턴스를 상자에 담아서
        return box; //이 상자를 반환한다.
    }
}

class GenericMethodBoxMaker{
    public static void main(String[]args){
        Box11<String> sBox = BoxFactory.makeBox("Sweet");
        System.out.println(sBox.get());

        Box11<Double> dBox = BoxFactory.makeBox(7.59);
        System.out.println(dBox.get());
    }
}
