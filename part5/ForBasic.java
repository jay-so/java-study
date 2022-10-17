package part5;
/*
반복의 횟수가 정해져 있는 상황에서는 for문을 이용해서 작성하는 것이 더 간결하고 뜻도 더 잘 통한다.
for(int num = 0; num<5;num ++){
    System.out.println("I love Java");
}

- for문:정해진 횟수의 반복을 위해 사용

for문의 구성
for(1.int num = 0; 2.num <5;3.num++){
    반복되어 출력할 문장
}
의미
1. 초기식 = 반복의 횟수를 세기 위한 변수
2. 조건식 = 반복의 조건
3. 증감식 = 반복의 조건을 무너트리기 위한 연산

for문의 실행 흐름
- 사진 참고
과정
1. 변수의 선엄 닟 초기화
2. 반복 조건이 true인지 확인
3. 반복의 영역을 실행
4. 변수의 값 증가
-> 반복 조건이 false가 되면 for문을 빠져나오면서 반복은 종료된다.
 */
public class ForBasic {
   public static void main(String[]args){
       for(int i = 0;i<5;i++){
           System.out.println("I love Java" + i);
       }
   }
}
