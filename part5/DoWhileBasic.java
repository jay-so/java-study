package part5;

/*
do ~ while문
- 먼저 실행한 후 조건을 검사한다.
실행 패턴
1) 먼저 중괄호 영역을 실행한다.
2) 그리고 조건 검사 후 결과가 true이면 반복을 검사한다.

while문과 do-while문의 차이점
while문 : 먼저 조건을 검사한 후 실행한다.
do- while문 : 먼저 실행한 후 조건을 검사한다.

 */

public class DoWhileBasic {
   public static void main(String[]args){
       int number = 0;

       do{
           System.out.println("I like Java" + number);
           number ++;
       }while (number<5);
   }
}

/*
do ~while문의 구조


do{
//반복 영역
    System.out.println("I like Java" + number);
    number ++;
}while(number<5);
//반복 조건: number<5

do- while문은 while문으로 작성 가능하고 그 반대로 while문 역시 do - while문으로 작성하는 것이 가능하다.
-> 따라서 다음의 경우에 한해 do- while문을 사용하고, 이외의 경우 while문이나 for문을 사용한다.
"조건에 따른 반복이 필요하다. 그런데 반드시 한 번은 실행을 해야 한다"
 */
