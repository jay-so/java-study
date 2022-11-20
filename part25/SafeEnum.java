package part25;

enum Animal2{
    DOG,CAT
}

enum Person2{
    MAN,WOMAN
}

public class SafeEnum {
    public static void main(String[]args){
        who(Person2.MAN); //정상적인 메소드 호출
       // who(Animal2.DOG); //비정상적인 메소드 호출
    }

    public static void who(Person2 man){
        switch (man){
            case MAN:
                System.out.println("남성손님입니다.");
                break;
            case WOMAN:
                System.out.println("여성 손님입니다.");
                break;
        }
    }
}
