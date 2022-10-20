package part10;

/*
클래스 변수 (static)
- static으로 선언된 변수는 변수가 선언된 클래스의 모든 인스턴스가 공유하는 변수이다.
- 어떠한 인스턴스에도 속하지 않은 상태로 메모리 공간에 딱 하나만 존재한 변수
- 이 변수가 선언된 클래스의 인스턴스들은 이 변수에 바로 접근할 수 있는 권한이 있을 뿐이다.
- 클래스 변수도 접근 수준 지시자의 규칙을 그대로 적용 받기 때문에 public으로 선언되면 어디서든 접근 가능하다.
 */

class InsCnt{
    static int instName = 0; //클래스 변수(static 변수)

    //생성자
    public InsCnt() { //static으로 선언된 변수의 값 증가
        instName ++; //static으로 선언된 변수의 값 증가
        System.out.println("인스턴스 생성: " + instName);
    }
}


public class ClassVar {
   public static void main(String[]args){
       //객체 생성
       InsCnt cnt1 = new InsCnt(); //instName = 1
       InsCnt cnt2 = new InsCnt(); //instName = 2
       InsCnt cnt3 = new InsCnt(); //instName = 3
   }
}
