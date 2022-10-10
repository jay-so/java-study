package part2;

/*
    변수의선언 및 사용
 */
public class UseVariable {
    public static void main(String[] args){
        int num1; //변수 num1을 선언
        num1 = 10; //변수 num1에 10을 저장

        int num2 = 20;//변수 num2 선언과 동시에 20으로 초기화
        int num3 = num1 + num2; //num1 + num2의 값을 변수 num3에 넣음
        System.out.println(num1 + " + " + num2 + " = " + num3); //출력: 10 + 20 = 30
    }
}
