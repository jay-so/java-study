package part6;

import java.util.Scanner;

public class Problem6_1_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        addition(a,b);
        subtraction(a,b);
        multiplication(a,b);
        division(a,b);
        remainder(a,b);

        sc.close();

    }

    //덧셈 연산
    public static void addition(int a, int b){
        System.out.println("덧셈 연산 : " +(a+b));
    }

    //뺄셈 연산
    public static void subtraction(int a, int b){
        System.out.println("뺄셈 연산 : " + (a-b));
    }

    //곱셈 연산
    public static void multiplication(int a, int b){
        System.out.println("곱셈 연산 : " + (a * b));
    }

    //나눗셈 연산 - 몫구하기
    public static void division(int a, int b){
        System.out.println("나눗셈 연산 : " + (a/b));
    }

    //나머지 연산
    public static void remainder(int a, int b){
        System.out.println("나머지 연산: " + (a %b));
    }
}
