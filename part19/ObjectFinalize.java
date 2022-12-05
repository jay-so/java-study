package part19;
class Person{
    String name;

    //생성자

    public Person(String name) {
        this.name = name;
    }
    //finalize 메소드 재정의
    @Override
    protected void finalize() throws Throwable{
        super.finalize(); //상위 클래스의 finalize 메소드 호출
        System.out.println("destroyed: " + name);
    }
}

class ObjectFinalize{
    public static void main(String[]args){
        Person p1 = new Person("Yoon");
        Person p2 = new Person("Park");
        p1 = null; //참조대상을 가비지 컬렉션의 대상으로 만듦
        p2 = null; //참조대상을 가비지 컬렉션의 대상으로 만듦

        System.out.println("end of Program!");
    }
}
