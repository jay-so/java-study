package part5;

public class Problem5_4 {
    public static void main(String[]args){
        int num = 1;
        int sum = 0;

        while(num<100){
            sum += num;
            num ++;
        }
        System.out.println(sum);
    }
}
