package part21;

class Apple5{
    public String toString(){
        return "I am an Apple.";
    }
}
class Orange5{
    public String toString(){
        return "I am an Orange.";
    }
}

class Box5<T>{
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}

class FruitAndBox2_Generic {
    public static void main(String[]args){
        Box5<Apple5> aBox = new Box5<>(); //T를 Apple로 결정
        Box5<Orange5> oBox = new Box5<>(); //T를 Orange로 결정

        aBox.set(new Apple5()); //사과를 상자에 담는다.
        oBox.set(new Orange5()); //오렌지를 상자에 담는다.

        Apple5 ap = aBox.get(); //사과를 꺼내는데 형 변환을 하지 않는다.
        Orange5 og = oBox.get(); //오렌지를 꺼내는데 형 변환을 하지 않는다.

        System.out.println(ap);
        System.out.println(og);
    }

}