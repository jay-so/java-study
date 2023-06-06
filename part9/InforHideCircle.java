package part9;

class Circle2{
    private double rad = 0;
    final double PI= 3.14;

    //생성자 - 초기화
    public Circle2(double rad){
        this.rad = rad;
    }
    //setter - 값을 저장
    public void setRad(double r){
        if(r<0){
            rad = 0;
            return;
        }else{
            rad = r;
        }
    }

    //getter - 값을 꺼내기 위함
    public double getRad(){
        return rad;
    }
    public double getArea(){
        return (rad * rad) * PI; //원의 넓이를 반환함
    }
}



public class InforHideCircle {
    public static void main(String[] args) {
        //객체를 생성함
        Circle2 c = new Circle2(1.5);
        System.out.println("반지름: " + c.getRad());
        System.out.println("넓이: " + c.getArea() + "\n");

        c.setRad(3.4);
        System.out.println("반지름: " + c.getRad());
        System.out.println("넓이: " + c.getArea());
    }

}
