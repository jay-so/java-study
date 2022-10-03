package part8;

public class CircleUsing {
    public static void main(String[]args){
        part8.com.wxfx.smart.Circle c1 = new part8.com.wxfx.smart.Circle(3.5);
        System.out.println("반지름 3.5 원 넓이:" + c1.getArea());

        part8.com.fxmx.simple.Circle c2 = new part8.com.fxmx.simple.Circle(3.5);
        System.out.println("반지름 3.5 원 둘레:" + c2.getPerimeter());
    }
}
