package part14;

class SuperCLS3{
    protected static int count = 0; //protected는 하위 클래스 접근을 허용

    public SuperCLS3() {
        count++;
    }
}

class  SubCLS3 extends SuperCLS3{
    public void showCount(){
        //상위 클래스에 위치한 클래스 변수 count에 접근
        System.out.println(count);
    }
}

public class SuperSubStatic {
    public static void main(String[]args){
        SuperCLS3 obj1 = new SubCLS3(); //count 값 1증가
        SuperCLS3 obj2 = new SubCLS3(); //count 값 1증가

        //아래 인스턴스 생성 과정에서 SuperCLS 생성자 호출되므로,
        SubCLS3 obj3 = new SubCLS3(); //count 값 1증가
        obj3.showCount();
    }
}
