package part8.com.fxmx.simple;

    /*
    원의 둘레 관련 클래스 정의
     */

public class Circle {
    double rad;
    final double PI;

    public Circle(double r){
        rad = r;
        PI = 3.14;
    }
    /*
    원의 둘레를 반환
     */
    public double getPerimeter(){
        return (rad * 2) * PI;
    }
}
