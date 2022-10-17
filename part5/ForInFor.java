package part5;

/*
모든 반복문은 조건문처럼 중복하여 사용할 수 있다.
for문, while문, do-while문 총 3개를 모두 중복할 수 있으며 총 3 * 3 = 9개의 형태로 반복문의 중첩이 가능하다.
2차원 형태, 배열의 형태가 나타내면 중첩반복이다.
 */
public class ForInFor {
    public static void main(String[] args){
       for(int i = 0;i<3;i++){      //바깥쪽 for문
           System.out.println("==============");
           for(int j = 0;j<3;j++){  //안쪽 for문
               System.out.print("[" + i + "," + j +"]");
           }
           System.out.print('\n');
       }
    }
}
