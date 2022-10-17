package part5;

/*
switch문의 일반적인 사용 모델
- 자바의 키워드 중에는 break문이 있다.
- switch문 안에 사용하게 되면 다음의 의미를 갖게 된다.
"switch문 밖으로 빠져 나가겠습니다.
-> 따라서 switch문 안에서 break문을 적절히 사용하게 되면 다음 구조의 실행 형태를 갖게 되고 if~ else if ~ else문을 일부 대체할 수 있는 형태이다.
switch(n){
    case 1:
        ~
        break;
    case 2:
        ~
        break;
     case 3:
        ~
        break;
     default:
        ~
        break;
      }
 */


public class SwitchBreak {
    public static void main(String[]args){
        int n = 3;

        switch (n){
            case 1:
                System.out.println("Simple Java");
                break;
            case 2:
                System.out.println("Funny Java");
                break;
            case 3:
                System.out.println("Fantastic Java");
                break;
            default:
                System.out.println("The best programming language");
                break;
        }

        System.out.println("Do you like Java");
    }
}

/*
    switch문의 특징 - 둘 이상의 레이블을 이어서 둘 수도 있다.
    따라서 다음과 같은 형태의 switch문 구성도 가능하다.
       switch(n){
       case 1:
       case 2:
       case 3:
            System.out.println("case 1,2,3");
            break;
       default:
            System.out.println("default");
       }


 */
