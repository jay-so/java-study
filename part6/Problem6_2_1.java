package part6;

import java.util.Scanner;

public class Problem6_2_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println("원의 넓이 : " + cicleFerence(a));
        System.out.println("원의 둘레 : " + circleArea(a));

        sc.close();
    }

    //원의 넓이 계산
    public static double circleArea(double num){
        double result = num * num * 3.14;
        return  result;
    }

    //원의 둘레 계산
    public static double cicleFerence(double num){
        double result = num * 2 * 3.14;
        return  result;
    }
}
