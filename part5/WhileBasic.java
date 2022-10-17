package part5;

/*
 반복문
 목적 = 조건에 맞게 코드를 반복해서 실행
 - 횟수를 만족할 때까지 게속 진행: for문
 - 만족할 경우 게속 코드를 진행 : while문
 */

public class WhileBasic {
    public static void main(String[]args){
        int num = 0;

        while(num<5){ //num <5을 만족하면 반복 실행
            System.out.println("I like Java" + num);
            num ++;
        }
    }
}
/*
 while문
 반복 조건 : num <5
 while 문 소괄호에는 반복의 조건을 명시한다. -> true 또는 false가 와야하므로 이를 반환하는 연산이 온다.
 - true를 반환하는 동안에는 횟수에 상관없이 while문의 중괄호가 반복 실행되는데 다음의 패턴이 반복된다.
 1) 먼저 조건을 검사한다.
 2) 그리고 그 결과가 true이면 중괄호 영역을 실행한다.

 -> 조건의 검사가 먼저 진행되기 때문에 처음부터 false가 반환되면 while문의 중괄호는 한 번도 실행되지 않을 수 잇다.
 -> 반면 조건 검사가 계속해서 true만 반환되도록 구성된다면 무한으로 실행되는 오류가 반복될 수 있다.

 while(num <5) {
 //반복 영역
    System.out.println("I like Java" + num);
    num ++;
 }
 */