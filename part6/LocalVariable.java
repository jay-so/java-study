package part6;
/*
 변수의 스코프 = 변수의 접근 가능 영역, 변수가 소멸되지 않고 존재할 수 있는 영역
 for문의 중괄호, 매개변수,if문의 조건 명시한 변수 = 지역변수
 특징
 지역변수는 선언된 지역을 벗어나면 메모리 공간에서 소멸된다.
 */
public class LocalVariable {
    public static void main(String[]args){
        boolean ste = true;
        int num1 = 11;

        if(ste){
            num1++;
            System.out.println(num1);
        }
        {
            int num2 = 33;
            num2++;
            System.out.println(num2);
        }
    }
}
