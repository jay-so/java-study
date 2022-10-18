package part6;

import java.util.Scanner;

public class Problem6_1_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        absoluteValue(a,b);
        sc.close();
    }

    public static void absoluteValue(int a,int b){
        int result = a-b>0?a-b:b-a;
        System.out.println(result);
    }
}
