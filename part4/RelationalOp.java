package part4;


public class RelationalOp {
    public static void main(String[] args){
        System.out.println("3 >= 2" + (3>=2));
        System.out.println("3 <= 2: " + (3<=2));
        System.out.println("7.0 == 7 : " + (7.0 == 7)); //자동 형 변환으로 정수 7이 실수 7.0으로 변환됨
        System.out.println("7.0 != 7 : " + (7.0 != 7));
    }
}
