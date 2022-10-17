package part5;

/*
break문, continue문 = 실행 흐름의 조절을 목적으로 반복문 내에 삽입되는 키워드
break문 = 반복문을 빠져나가는 용도로도 사용된다.
 */

public class BreakBasic {
    public static void main(String[]args){
        int num = 1;
        boolean search = false;

        //처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복문
        while (num<100){
            if(((num%5)==0)&&((num%7)==0)){
                search = true;
                break;//while문을 탈출
            }
            num ++;
        }

        if(search){
            System.out.println("찾는 정수 : " + num);
        }else {
            System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");
        }
    }
}
/*
break문을 가장 가까이서 감싸고 있는 것은 if문이다. 그러나 break문이 실행되면
가장 근버한 거리에서 자신을 감싸고 있는 반복문을 찾아서 해당 반복문을 빠져나간다.
그리고 이어서 그 다음 문장을 실행하게 된다.
 */
