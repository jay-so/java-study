package part6;
/*
키워드 return이 지니는 두가지 의미
1. 메소드를 호출한 영역으로 값을 반환
2. 메소드의 종료
 */
public class OnlyExitReturn {
    public static void main(String[]args){
        divide(4,2);
        divide(6,2);
        divide(9,0);
    }

    public static void divide(int num1, int num2){
        if(num2 ==0){
            System.out.println("0으로 나눌 수 없습니다.");
            return;
        }
        System.out.println("나눗셉 결과: " + (num1/num2));
    }
}
