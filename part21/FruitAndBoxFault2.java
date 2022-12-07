package part21;
class Apple4{
    public String toString(){
        return "I am an Apple.";
    }
}

class Orange4{
    public String toString(){
        return "I am an Orange.";
    }
}

class Box4{
    private Object ob;

    public Object get() {
        return ob;
    }

    public void set(Object ob) {
        this.ob = ob;
    }
}

public class FruitAndBoxFault2 {
    public static void main(String[]args){
        Box4 abox = new Box4();
        Box4 obox = new Box4();

        //다음의 두 문장은 프로그래머의 실수 입니다.
        abox.set("Apple");
        obox.set("Orange");

        //문자열을 출력합니다.
        System.out.println(abox.get());
        System.out.println(obox.get());
    }
}

