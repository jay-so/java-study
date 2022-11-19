package part21;

class Apple4 {
    public String toString(){
        return "I am an apple.";
    }
}

class Orange4{
    public String toString(){
        return "I am an orange.";
    }
}

class Box7{
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
        Box7 aBox = new Box7();
        Box7 oBox = new Box7();

        //다음 두 문장은 프로그래머의 실수이다.
        aBox.set("Apple");
        oBox.set("Orange");

        System.out.println(aBox.get());
        System.out.println(oBox.get());
    }
}
