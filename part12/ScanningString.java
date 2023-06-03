package part12;

import java.util.Scanner;

public class ScanningString {
    public static void main(String[] args) {
        String source = "1 3 5";
        Scanner scanner = new Scanner(source);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        System.out.printf("%d + %d + %d = %d",num1,num2,num3,sum);
    }
}
