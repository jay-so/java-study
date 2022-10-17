package part5;

/*
 조건 연산자
 - 조건 연산자 = 피연산자가 3개인 연산자이다.
 - 구조
    조건? 수1: 수2
    - 조건이 참이라면 수1가 반환된다.
    - 조건이 거짓이라면 수2가 반환된다.

    bit = (num1>num2) ? num1 : num2;
    -> 조건: num1이 num2보다 크다면 참이 반환된다. 결과는 false이다.
       따라서 num2의 값을 반환한다.

    diff = (num1>num2) ? (num1 - num2) : (num2 - num1);
    -> 조건:  num1이 num2보다 크다면 참이 반환된다. 결과는 false이다.
    따라서 diff에 (num2 - num1)의 값이 반환된다.
 */

public class CondOp {
   public static void main(String[]args){
       int num1 = 50;
       int num2 = 100;
       int big;
       int diff;

       big = (num1>num2)?num1:num2;
       System.out.println("큰 수: " + big);

       diff = (num1>num2)? (num1 - num2):(num2 - num1);
       System.out.println("절댓값: " + diff);
   }
}
