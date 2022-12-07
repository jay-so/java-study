package part21;
class Apple2{
    public String toString(){
        return "I am an Apple.";
    }
}

class Orange2{
    public String toString(){
        return "I am an Orange.";
    }
}

class Box2{ //무엇이든 담을 수 있는 상자
    private Object ob;

    public Object get() {
        return ob;
    }

    public void set(Object ob) {
        this.ob = ob;
    }
}

class FruitAndBox2{
    public static void main(String[]args){
        Box2 aBox = new Box2(); //상자 생성
        Box2 oBox = new Box2(); //상자 생성

        aBox.set(new Apple2()); //상자에 사과를 담는다.
        oBox.set(new Orange2()); //상자에 오렌지를 담는다.

        Apple2 ap = (Apple2)aBox.get(); //상자에서 사과를 꺼낸다.
        Orange2 og = (Orange2) oBox.get(); //상자에서 오렌지를 꺼낸다.

        System.out.println(ap);
        System.out.println(og);
    }
}
