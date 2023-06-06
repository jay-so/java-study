package part10;

class Circle{
    static final double PI = 3.1415; //클래스 상수 선언
    private double radius;

    //생성자

    public Circle(double radius) {
        this.radius = radius;
    }

    void showPerimeter(){
        double peri = (radius * 2) * PI;
        System.out.println("둘레 : " + peri);
    }

    void showArea(){
        double area = (radius * radius) * PI;
        System.out.println("넓이: " + area);
    }
}


public class CircleConstPI {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.2);
        Circle c2 = new Circle(1.5);

        c1.showPerimeter();
        c1.showArea();
        c2.showPerimeter();
        c2.showArea();
    }
}
