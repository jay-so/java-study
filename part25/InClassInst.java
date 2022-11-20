package part25;

class Person3{
    public static final Person3 MAN = new Person3();
    public static final Person3 WOMAN = new Person3();

    @Override
    public String toString(){
        return "I am a dog person"; //"나는 개를 사랑하는 사람입니다."
    }
}


public class InClassInst {
    public static void main(String[]args){
        System.out.println(Person3.MAN);
        System.out.println(Person3.WOMAN);
    }
}
