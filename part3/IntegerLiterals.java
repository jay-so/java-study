package part3;

public class IntegerLiterals {
    public static void main(String[] args){
        int num1 = 123; //10진수로 표현
        int num2 = 0123; //8진수로 표현
        int num3 = 0x123; //16진수로 표현
        int num4 = 100_000_000; //큰 수의 표현을 위해서는 _를 사용합니다.

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("nun3 : " + num3);

        System.out.println("11 + 22 + 33 ");
        System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
        System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
        System.out.println(3147483647L + 3147483648L);

    }
}
