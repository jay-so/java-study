package part5;

/*
 if ~ else if문 ~ else문
 - 여러가지 문장에서 조건에 따라 하나의 문장만 실행하고 싶다면 다음과 같은 구조의 문장을 구성하면 된다.(문장의 중간에 얼마든지 else if문을 추가할 수 있다.
 - 맨 위의 if문에서의 조건을 검사하면서 내려온다. 그러다가 조건이 true인 부분을 만나면 해당 부분에 속한 문장을 실행하고 나머지는 건너 뛰게 된다.
 그러다가 마지막까지 조건이 true인 부분을 만나지 못하면 마지막에 위치한 else에 속한 문장을 실행하게 된다.
 if( ~){
  System. ~
  }else if(~){
  System. ~
  }else if(~){
  System.~
  }else {
  System. ~

 */


public class IEIE {
    public static void main(String[]args){
        int num = 120;

        if(num < 0){ //먼저 if문을 검사한다.
            System.out.println("0 미만");
        }else if(num<100){ //먼저 작성한 if문이 해당하지 않을 경우 실행
            System.out.println("0 이상 100 미만");
        }else{ //위의 두 조건에 해당되지 않으면 else문을 실행
            System.out.println("100이상");
        }
    }
}

/*
  - if ~else if ~ else문은 if ~else문을 중첩시킨 결과이다.
  다음의 문장을 보자, 두 조건문은 동일한 내용을 출력한다.
  if(num <0) {
    System.out.println("0미만");
  }else {
    if(num <100)
        System.out.println("0이상 100미만");
    else
        System.out.println("100이상");
   }
   - if절과 else절에 속한 문장은 하나인 경우에 중괄호를 생략할 수 있음으로 다음과 같다.

  if(num<0)
     System.out.println("0미만");
  else
     if(num <100)
        System.out.println("0이상 100미만");
    else
        System.out.println("100이상");

   -> 이를 보다 가독성 높게(간격 및 행을 조절하여 읽기 쉽게) 만든 문장은 다음과 같다.

   if(num <0)
        System.out.println("0미만");
   else if(num <100)
        System.out.println("0이상 100미만");
   else
        System.out.println("100 이상");

 -> 따라서 위를 통해 알 수 있는 것
 "if ~else if~ else문은 사실 if ~else문을 중첩시킨 결과이다."
 */
