package part5;

/*
무한루프 -의도적으로 : 값의 범위를 정해높고 조건을 정해 해당 범위 내에서 값을 찾읗 때
 */

//6의 배수이면서 14의 배수인 가장 작은 자연수를 찾는 예제 = 최소 공배수
//의미 : 6의 배수이면서 14의 배수인 자연수를 찾을 때까지 이 반복을 게속하겠다.
public class InfinityLoop {
    public static void main(String[]args){
        int num = 1;

        //의도적으로 무한루프를 돌림
        while (true){
            if(((num%6)==0)&&((num%14)==0)){
                break;
            }
            num++;
        }
        System.out.println(num);
    }
}
