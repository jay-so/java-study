package part10;

class InstCnt2{
    static int instNum = 100;

    public InstCnt2() {
        instNum++;
        System.out.println("인스턴스 생성: " + instNum);
    }
}


public class OnlyClassNoinstance {
    public static void main(String[] args) {
        InstCnt2.instNum -= 15; //인스턴스 생성 없이 instNum에 접근함
        System.out.println(InstCnt2.instNum);
    }
}
