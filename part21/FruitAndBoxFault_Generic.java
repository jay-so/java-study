package part21;

class Apple5{
    public String toString(){
        return "I am an apple.";
    }
}

class Orange5{
    public String toString(){
        return "I am an orange.";
    }
}

class Box8<T>{
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
        Box8<Apple5> aBox = new Box8<Apple5>();
        Box8<Orange5> oBox = new Box8<Orange5>();

        //aBox.set("Apple"); //프로그래머의 실수
        //oBox.set("Orange"); //프로그머의 실수

        Apple5 ap = aBox.get();
        Orange5 og = oBox.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
