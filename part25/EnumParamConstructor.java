package part25;
enum Person6{
    MAN(29), WOMAN(25);

    int age;

    private Person6(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "I am " + age + " years old";
    }
}

class EnumParamConstrucotr{
    public static void main(String[]args){
        System.out.println(Person6.MAN);
        System.out.println(Person6.WOMAN);
    }
}