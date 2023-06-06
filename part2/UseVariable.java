package part2;

class UseVariable{
    public static void main(String[] args) {
        int num1; //변수 num1의 선언
        num1 = 10; //변수 num1에 10을 저장

        int num2 = 20; //변수 num2 선언과 동기에 20으로 초기화
        int num3 = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + num3);
    }
}
