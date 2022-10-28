package part13;

class Box{
    private String conts;

    public Box(String conts) {
        this.conts = conts;
    }
    public String toString(){
        return conts;
    }
}

public class ArrayInInstance2 {
    public static void main(String[]args){
        Box[] ar = new Box[5]; // 길이가 5인 Box형 1차원 배열의 생성
        System.out.println("length : " + ar.length);
    }
}
