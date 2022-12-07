package part21;
interface Eatable{
    public String eat();
}

class Apple7 implements Eatable{
    public String toString(){
        return "I am an apple.";
    }

    @Override
    public String eat(){
        return "It tastes so good!";
    }
}

class Box10<T extends Eatable>{
    T ob;

    public T get() {
        System.out.println(ob.eat()); //Eatable로 제한하였기 때문에 eat을 호출 가능합니다.
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
}
class BoundedInterfaceBox{
    public static void main(String[]args){
        Box10<Apple7> box = new Box10<>();
        box.set(new Apple7()); //사과를 저장합니다.

        Apple7 ap = box.get(); //사과를 꺼냅니다.
        System.out.println(ap);
    }
}