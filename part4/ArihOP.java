package part4;


/*
    대입연산자와 산술 연산자: = , +, -, *,/,%
    - 피 연산자들의 자료형이 같아야 연산이 가능함
    대입 연산자 : =
    덧셈 연산자 : +
    뺄셈 연산자 : -
    곱셈 연산자 : *
    나누기 연산자(몫) : /
    나머지 연산자(나머지) : %

 */
public class ArihOP {
    public static void main(String[] args){
       int num1 = 7;
       int num2 = 3;

       System.out.println("num1 + num2 = " + (num1 + num2));
       System.out.println("num - num2 = " + (num1 - num2));
       System.out.println("num * num2 = " + (num1 * num2));
       System.out.println("num / num2 = " + (num1 / num2));
       System.out.println("num % num2 = " + (num1 % num2));
       //실수형 나눗셈
       System.out.println("num1 / num2 =  " + (7.0/3.0));
    }
}
