package part2;

public class VariableDecl {
    public static void main(String[] args) {
        double num1,num2; //두 개의 변수 동시 선언
        double result;
        num1 = 1.000001;
        num2 = 2.000001;
        result = num1 + num2;
        System.out.println(result);
    }
}
