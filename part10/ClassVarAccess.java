package part10;
/*
   클래스 변수에 접근하는 방법은 접근 영역을 기준으로 크게 2가지로 나뉜다.
   1. 클래스 내부에서 접근하는 경우 = 클래스 변수의 이름을 통해 직접 접근함
   2. 클래스의 외부에서 접근하는 경우 = 1) 클래스 또는 2) 인스턴스의 이름을 통해서 접근 가능함
 */
class AccessWay{
    static int num = 0;

    //생성자
    public AccessWay() {
        incrCnt();
    }
    void incrCnt(){
        num++; //클래스 내부에서 static 변수를 통한 접근
    }
}

public class ClassVarAccess {
    public static void main(String[]args){
        AccessWay way = new AccessWay();
        way.num++; //클래스 외부에서 객체의 이름을 통해 접근
        AccessWay.num++; //클래스 외부에서 클래스명을 통해 접근
        System.out.println("num = " + AccessWay.num);
    }
}
