package part10;


class InstCnt{
    static int instNum = 0;

    //생성자

    public InstCnt() {
        instNum++; //static으로 선언된 변수의 값을 증가시킴
        System.out.println("인스턴스 생성: " + instNum);
    }
}


public class ClassVar {
    public static void main(String[] args) {
        //객체 생성
        InstCnt instCnt1 = new InstCnt(); //instName = 1
        InstCnt instCnt2 = new InstCnt(); //instName = 2
        InstCnt instCnt3 = new InstCnt(); //instName = 3
    }
}
