package part8.com.wxfx.smart;
    //원의 널이 관련 클래스의 정의

public class Circle {
    double rad;
    final double PI;

    public Circle(double r){
        this.rad = r;
        this.PI = 3.14;
    }

    public double getArea(){
        return (rad * rad) * PI; //원의 넓이를 반환함
    }
}
