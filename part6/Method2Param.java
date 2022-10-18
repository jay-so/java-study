package part6;

/*
예를 통해 정의된 메소드를 살펴보자
1. 매개변수의 선언이 둘 이상이 될 수 있음을 보여준다.
   public static void hiEveryone(int age, double height)
2. 해당 메소드를 호출할 때는 다음과 같이 매개변수의 수와 자료형이 일치하는 값을 전달해야 한다.
   hiEveryone(12,12.5);
   hiEveryone(13,myHeight);
3. 다음과 같이 값의 전달이 불필요한 경우에는 메소드의 매개변수 선언을 생략할 수 있다.
   public static void byEveryone(){...}
 */
public class Method2Param {
    public static void main(String[]args){
        double myHeight = 175.9;
        hiEveryone(12,12.5); //인자 12와 12.5의 전달
        hiEveryone(13,myHeight); //인자 13과 변수 myHeight에 저장된 값 전달
        byEveryone(); //전달하는 인자 없음
    }

    public static void hiEveryone(int age, double height){
        System.out.println("제 나이는 " + age+ "세 입니다.");
        System.out.println("저의 키는 " + height + "cm 입니다.");
    }

    public static void byEveryone(){
        System.out.println("다음에 뵙겠습니다.");
    }
}
