package part2;

class UseVariable{
    public static void main(String[]args){
        int number; //변수 number를 선언
        number = 10; //변수 number에 10이라는 값을 할당함

        int number2 = 20; //변수 number2를 선언과 함께 20이라는 값을 대입함(변수의 선언과 동시에 변수의 값 할당 = 변수의 초기화)
        int result = number + number2; //변수 number와 number2를 더해서 result라는 변수에 값을 대입함
        System.out.println(result);
    }
}
