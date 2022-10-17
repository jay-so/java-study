package part5;

/*
break문을 실행하면 자신을 감싸고 있는 하나의 반복문을 빠져나갈 뿐 중첩된 반복분 전부를 빠져나가지는 못한다.
따라서 다음의 상황에서 사용할 경우 문제가 될 수 있다.
"구구단에서 곱의 결과가 72인 결과를 딱 하나만 보여라"
 */
public class BreakPoint {
    public static void main(String[]args){
        for(int i = 1;i<10;i++){
            for(int j = 1;j<10;j++){
                if((i*j)==72){
                    System.out.println(i + "x" + j + " = " + i*j);
                    break;
                }
            }
        }
    }
}
