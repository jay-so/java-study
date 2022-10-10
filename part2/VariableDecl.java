package part2;

/*
 실수형 자료형 사용: float, double
 */
public class VariableDecl {
    public static void main(String[] args){
        double num1, num2;// 두개의 변수 num1과 num2를 동시에 선언
        double result;
        num1 = 1.0000001;
        num2 = 2.0000001;
        result = num1 + num2;
        System.out.println(result);// 출력값: 3.0000001999999997 - 컴퓨터의 실수 표현에는 오차가 존재하기 때문에 3.0000002가 출력 되지 않는다.
    }

}
