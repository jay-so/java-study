package part8.com.wxfx.smart;
    /*
    원의 넓이 관련 클래스 정의
     */

public class Circle {
    double rad;
    final double PI;

    public Circle(double r){
        rad = r;
        PI = 3.14;
    }
    /*
    원의 넓이 반환
     */

    public double getArea(){
        return(rad*rad) *PI ;
    }
}
