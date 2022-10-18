package part6;

/*
자바 프로그래밍의 일종의 약속
"자바 프로그램은 main이라는 이름의 메소드에서부터 시작한다" -> main메소드는 무조건 있어야 한다.

본문의 hiEveryone메소드를 통해 메소드 정의와 변수 age,변수가 어떻게 활용되는지 확인함
 */


public class MethodDef {
   public static void main(String[]args){
       System.out.println("프로그램의 시작");
       hiEveryone(12); //12를 전달하며 hiEveryone 호출 - 메소드 호출문
       hiEveryone(13); //13을 전달하며 hiEveryone 호출 - 메소드 호출문
       System.out.println("프로그램의 끝");
   }

   //메소드 정의
   public static void hiEveryone(int age){
       System.out.println("좋은 아침입니다.");
       System.out.println("제 나이는 " + age + "세 입니다.");
   }
}

/*
매개변수 = 메소드 호출 시 전달되는 값을 받기 위해 선언된 변수를 가리킨다.
1. 메소드 호출 시 선언되어, 전달되는 값을 저장한다.
2. 매개변수가 선언된 메소드 내에서만 유요한 변수이다.
 */
