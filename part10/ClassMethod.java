package part10;

/*
  클래스 메소드란?
  - 객체 생성 이전에 호출이 가능하며 어떠한 객체에도 속하지 않는 메소드이다.

 */

class NumberPrinter{
    private int myNum = 0;
    static void showInt(int n){
        System.out.println(n);
    } //클래스 메소드 (static 메소드)
    static void showDouble(double n){
        System.out.println(n);
    } //클래스 메소드(static 메소드)
    void setMyNumber(int n){
        myNum = n;
    } //인스턴스 메소드
    void showMyNumber(){
        showInt(myNum);
    } //인스턴스 메소드
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
