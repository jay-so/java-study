package part10;
/*
클래스 변수(static 변수)의 특징 : "인스턴스 간에 데이터 공유가 필요한 상황에서 클래스 변수를 선언한다.
=> 객체 간에 클래스 변수에 접근이 가능하다.(객체들이 데이터 공유가 가능하다.)
 */
class Circle{
    static final  double PI = 3.1415; //변하지 않는 값을 같는 static 상수
    private double radius; //클래스 변수

    public Circle(double radius) {
        this.radius = radius;
    }

    void showPerimeter(){
        double peri = (radius* 2)*PI;
        System.out.println("둘레: " + peri);
    }

    void  showArea(){
        double area = (radius * radius) * PI;
        System.out.println("넓이: " +area);
    }
}


public class CircleConstPI {

    public static void main(String[]args){
        Circle c1 = new Circle(1.2);
        Circle c2 = new Circle(1.5);
        c1.showPerimeter();
        c1.showArea();
        c2.showPerimeter();
        c2.showArea();
    }
}
