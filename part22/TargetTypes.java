package part22;

class EmptyBoxFactory{
    public static<T> Box<T> makeBox(){ //제네릭 메소드
        Box<T> box = new Box<>(); //상자 생성
        return box; //생성한 상자 반환
    }
}

public class TargetTypes {
    public static void main(String[]args){
        Box<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
        iBox.set(25);
        System.out.println(iBox.get());
    }
}
