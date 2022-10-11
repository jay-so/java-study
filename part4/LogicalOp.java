package part4;

/*
 논리 연산자 : &&, ||, !
 && : 모두 다 참일때 true(논리 연산자 and)
 || : 한 쪽이라도 참일때 true(논리 연산자 or)
 ! : 참일때 false, 거짓일 때 true
 */

public class LogicalOp {
    public static void main(String[] args){
        int num1 = 11;
        int num2 = 22;
        boolean result;

        //변수 num1에 저장된 값이 1과 100 사이의 수인가?
        result = (1<num1)&&(1<100);
        System.out.println("1초과 100 미만인가? " + result);

        //변수 num2에 저장된 값이 2 또는 3의 배수인가?
        result = (((num2%2)==0)||(num2%3)==0);
        System.out.println("2또는 3의 배수인가?" + result);

        //변수 num1이 0인가?
        result = !(num1 !=0);
        System.out.println("0인가? " + result);
    }
}
