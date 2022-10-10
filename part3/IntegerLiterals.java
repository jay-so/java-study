package part3;

/*
 리터럴 상수
 ex) int num = 157; 일때 =(대입 연산자) 오른쪽의 숫자 157을 가리켜 '리터럴' 혹은 '리터럴 상수'라고 합니다.
 - "컴파일러의 입장에서 숫자 157은 int형 정수로 인식하겠다"라는 의미 입니다.
 */

/*
 정수형 상수(리터럴 상수)의 표현 방법
 - 10진수로 int형 정수 표현
 int num = 11 + 22 + 33;
 - 8진수 int형 정수 표현: 숫자 앞에 0을 삽입
 int num = 011 + 022 + 033;
 - 16진수로 int형 정수 표현 : 숫자 앞에 0x또는 0X를 삽입

 - 자바는 byte형,short형으로 정수를 표현하는 방법을 제공하지 않음으로 덧셈을 byte형이나 short형으로 진행하는 방법은 없습니다.

 단) Long형 경우는 별도의 정수 표현 방법을 제공합니다. 따라서 long형으로 사칙연산을 해야 할 경우
 숫자 끝에 문자 L또는 l을 붙이는 것이 long형 정수의 표현 방법입니다.
 System.out.println(3147483647L + 3147483648L);
 */
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
