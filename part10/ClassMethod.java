package part10;


class NumberPrinter{
    private int myNum = 0;

    static void showInt(int n){ //클래스 메소드(static 메소드)
        System.out.println(n);
    }

    static void showDouble(double n){ //클래스 메소드(static 메소드)
        System.out.println(n);
    }

    void setMyNumber(int n){ //인스턴스 메소드
        myNum = n;
    }

    void showMyNumber(){ //인스턴스 메소드
        showInt(myNum);
    }
}

public class ClassMethod {
   public static void main(String[]args){
       NumberPrinter.showInt(20); //클래스 이름을 통한 클래스 메소드 호출(추천)

       NumberPrinter np = new NumberPrinter(); //객체 생성(비추천)
       np.showDouble(3.15); //객체 이름을 통한 메소드 호출
       np.setMyNumber(75);
       np.showMyNumber();
   }
}
