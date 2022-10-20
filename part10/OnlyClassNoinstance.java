package part10;
/*
다음의 예를통해 알 수있는 점은 다음과 같다.
- 클래스 변수는 인스턴스 생성 이전에 메모리 공간에 존재한다.
- 클래스 변수는 해당 클래스 정보가 JVM(가상 머신)에 의해 읽히는 순간 메모리 공간에 할당되고 초기화 된다.
 */
class InstCnt2{
    static int instNum = 100; //클래스 변수의 정상적인 초기화 방법

    public InstCnt2() {
        instNum++;
        System.out.println("인스턴스 생성: " + instNum);
    }
}


public class OnlyClassNoinstance {
    public static void main(String[]args){
        InstCnt2.instNum-= 15; //객체생성 없이 instCnt2에 접근이 가능함
        System.out.println(InstCnt2.instNum);
    }
}
