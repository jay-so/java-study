package part9;

class Circle2{
    private double rad = 0;
    final double PI = 3.14;

    public Circle2(double r){
        setRad(r);
    }
    public void setRad(double r){
        if(r<0){
            rad = 0;
            return;
        }
        rad = r;
    }

    public double getRad(){
        return rad;
    }
    public double getArea(){
        return (rad *rad) * PI; //원의 넓이 반환
    }
}



public class InforHideCircle {
    public static void main(String[]args){
        //객체 생성
        Circle2 c = new Circle2(1.5);
        System.out.println("반지름: " + c.getRad());
        System.out.println("넓이: " + c.getArea() + "\n");

        c.setRad(3.4);
        System.out.println("반지름: " + c.getRad());
        System.out.println("넓이: " + c.getArea());
    }
}
