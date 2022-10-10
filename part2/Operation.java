package part2;

public class Operation {
    public static void main(String[] args){
        /*
        자바의 정수형 연산은 int형으로 진행하기 때문에 short를 사용하면 컴파일 오류가 발생합니다.
        자바의 가상머신은 정수형 연산을 4바이트 int형으로만 진행합니다. 따라서 byte형 변수나 short형 변수에 저장된 값으로
        사칙 연산으로 할 경우 자동적 형 변환으로 int형으로 변환하게 됩니다.

        short num1 = 11;
        short num2 = 22;
        //문제 발생 구간 - int형 사칙연산 값을 short형으로 선언된 result에 대입하게 되어 오류가 발생합니다.
        따라서 대부분의 상황에서 java의 정수형은 int형으로 사용합니다.

        short형을 사용하는 경우 = 3D그래픽 정보나 매우 많은 음원 정보는 byte나 short를 이용하는 것이 더 합리적입니다.

        short result = num1 + num2;
        System.out.println(num1 + num2);
         */

        int num1 = 11;
        int num2 = 22;
        int result = num1 + num2;
        System.out.println(result);
    }
}
