package part29;

import java.util.Arrays;

public class MyFirstStream2 {
    public static void main(String[]args){
        int[]ar = {1,2,3,4,5};

        int sum = Arrays.stream(ar) //스트림 생성하고
                .filter(n->n%2 == 1) //filter 통과시키고,
                .sum(); //sum을 통과시켜 그 결과 반환
        System.out.println(sum);
    }
}
