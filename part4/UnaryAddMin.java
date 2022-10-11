package part4;

/*
 단항 연산자 = 피연산자가 하나인 연산자
 부호 연산자 : +(양수)는 보통 생략한다., -(음수)
 */

public class UnaryAddMin {
    public static void main(String[] args){
        short num1 = 5;
        System.out.println(num1);
        System.out.println(-num1);

        short num2 = 7;
        short num3 = (short) (+num2);
        short num4 = (short) (-num3);
        System.out.println(num3);
        System.out.println(num4);
    }
}
