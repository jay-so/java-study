package part5;

/*
 switch문의 기본 골격
 switch(n){
 case 1:
  ~
 case 2:
  ~
  case 3:
  ~
  default:
   ~
  }

  키워드 case와 default를 가리켜 라벨(레이블)이라고 한다.
  -> 문구점에서 살 수 있는 책이나 공책을 라벨로 특정 위치를 분류한다고 생각하면 된다.
 */


public class SwitchBasic {
    public static void main(String[]args){
        int n = 3;

        switch (n){

            case 1:
                System.out.println("Simple Java");
            case 2:
                System.out.println("Funny Java");
            case 3:
                System.out.println("Fantastic Java");
            default:
                System.out.println("The best programming language");
        }

        System.out.println("Do you like Java");
    }
}

/*
 n의 값이 3인 상황에서 case 3의 부분으로 이동하여 출력하게 된다.
 ->default부분을 포함한 상태에서 n이 3이 이상인 부분 부터 실행을 이여간다.

 switch문의 들여쓰기
 - 앞서 살펴본 switch문을 관찰해보면 case와 default는 들여쓰기를 하지않음을 알 수 있다.
 - case와 default는 레이블(라벨)이다.
 -> 이는 책에 위치를 표시한 라벨을 생각하면 알 수 있다. 레이블은 책을 펼치기 전에 보여야 한다. 이와 마찬가지로 case와 default도 조금이라도 잘 보이도록 들여쓰기 대상에서 제외되는 것이 일반적이다.
 */
