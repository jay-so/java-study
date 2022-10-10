package part2;

/*
프로그램에서 참인 상황과 아닌 상황(거짓)인 상황 또는 상태를 표현하는데 자주 사용합니다.
Java의 논리 자료형 : Boolean
true = '참'을 의미하는 값
false = '거짓을 의미하는 값
 */
public class Boolean {
    public static void main(String[]args){
        boolean b1 = true; //참으로 선언
        boolean b2 = false; //거짓으로 선언
        System.out.println(b1);
        System.out.println(b2);

        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 < num2); // 10이 20보다 작은가? = 참(true)
        System.out.println(num1 > num2); // 10이 20보다 큰가? = 거짓(false)
    }
}
