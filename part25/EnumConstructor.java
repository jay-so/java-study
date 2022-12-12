package part25;
enum Person5{
    MAN,WOMAN;

    private Person5(){
        System.out.println("Person constructor called");
    }
    @Override
    public String toString(){
        return "I am a dog person";
    }
}

class EnumConstructor{
    public static void main(String[]args){
        System.out.println(Person5.MAN);
        System.out.println(Person5.WOMAN);
    }
}
