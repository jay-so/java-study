package part5;

/*
 구구단 출력의 예제를 while문 중첩으로 재구현한 결과
 -> for문을 중첩해서 구현했을 때보다 코드의 구성이 복잡하다.
 때문에 반복문을 중첩할 때는 for문을 우선 고려한다.
 */
public class ByTimesWhile {
    public static void main(String[] args){
        int i = 2;
        int j;

        while (i<10){
            j = 1;
            while (j<10){
                System.out.println(i + "x" + j + " = " + (i*j));
                j++;
            }
            i++;
        }
    }
}
