package part4;

/*
 증가 및 감소 연산자: Prefix ++, Prefix --
 val = ++n; => n에 저장된 값을 1 증가하여 변수 val에 저장
 val = --n; => n에 저장된 값을 1 감소하여 변수 val에 저장
 */
public class PrefixOp {
    public static void main(String[] args){
       int num = 7;
       System.out.println(++num); //num의 값: 8
       System.out.println(++num); //num의 값: 9
       System.out.println(num); //num의 값인 9 출력
    }
}
