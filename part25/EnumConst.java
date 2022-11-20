package part25;

enum Person4{
    MAN,WOMAN;

    @Override
    public String toString(){
        return "I am a dog person";
    }
}

public class EnumConst {
    public static void main(String[]args){
        System.out.println(Person4.MAN); //toString 메소드의 반환 값 출력
        System.out.println(Person4.WOMAN); //toString 메소드의 반환 값 출력
    }
}
