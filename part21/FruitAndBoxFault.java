package part21;
class Apple3{
    public String toString(){
        return "I am an Apple.";
    }
}
class Orange3{
    public String toString(){
        return "I am an Orange.";
    }
}

class Box3{
    private Object ob;

    public Object get() {
        return ob;
    }

    public void set(Object ob) {
        this.ob = ob;
    }
}

class FruitAndBoxFault{
    public static void main(String[]args){
        Box3 aBox = new Box3();
        Box3 oBox = new Box3();

        //아래 두 문장에서는 사과와 오렌지가 아닌 "문자열"을 담았다.
        aBox.set("Apple");
        oBox.set("Orange");

        //상자에 과일이 담기지 않았는데 과일을 꺼내려 한다.
        Apple3 ap = (Apple3) aBox.get();
        Orange3 og = (Orange3) oBox.get();

        System.out.println(ap);
        System.out.println(og);
    }
}
