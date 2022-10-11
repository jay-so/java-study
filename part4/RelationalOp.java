package part4;

/*
 관계 연산자 : <, > , <=, >=, == , !=
 관계 연산자 = 두 개의 피연산자 사이에서 크기 및 동등 관계를 따져주는 이항 연산자(비교 연산자라고도 함)
 <= : 같거나 작은가?
 >= : 같거나 큰가?
 == : 같은가? -> 같으면 참(true), 다르면 거짓(false)
 != : 서로 다른가? -> 서로 다르면 참(true(, 다르면 거짓(false)
 */
public class RelationalOp {
    public static void main(String[] args){
        System.out.println("3 >= 2" + (3>=2));
        System.out.println("3 <= 2: " + (3<=2));
        System.out.println("7.0 == 7 : " + (7.0 == 7)); //자동 형 변환으로 정수 7이 실수 7.0으로 변환됨
        System.out.println("7.0 != 7 : " + (7.0 != 7));
    }
}
