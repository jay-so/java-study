package part21;
class Apple6{
    public String toString(){
        return "I am Apple.";
    }
}
class Orange6{
    public String toString(){
        return "I am Orange.";
    }
}

class Box6<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

public class FruitAndBoxFault_Generic {
    public static void main(String[]args){
        Box6<Apple6> aBox = new Box6<>();
        Box6<Orange6> oBox = new Box6<>();

        //aBox.set("Apple."); //프로그래머의 실수
        //oBox.set("Orange."); //프로그래머의 실수

        Apple6 ap = aBox.get();
        Orange6 og = oBox.get();

        System.out.println(ap);
        System.out.println(og);
    }
}