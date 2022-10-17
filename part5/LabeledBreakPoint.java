package part5;
/*
 BreakPont에서의 문제점은 break는 감싸는 반복문 1번만 빠져나간다는 점이다.
 이때 레이블을 이용해서 빠져 나갈곳을 명시하면 된다.
 switch문에서 레이블(라벨)을 봤듯이 break문에서도 위치의 지정하여 빠져 나갈 수 있도록 이용할 수 있다.
 */
public class LabeledBreakPoint {
    public static void main(String[] args){
       outer: for(int i = 1; i<10;i++){//바깥쪽 for문에 레이블 outer명시
        for(int j = 1; j<10;j++){
            if((i*j)==72){
                System.out.println(i + " x "+ j + " = " + i*j);
                break outer; //outer로 명시된 반복문까지 빠져나간다.
            }
        }
       }
    }
}
