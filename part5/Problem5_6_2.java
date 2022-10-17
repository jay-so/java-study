package part5;

public class Problem5_6_2 {
    public static void main(String[]args){
        int sum = 0;
        int num = 1;
        int count = 0;

        while (true){
            if((num %2) != 0){
                sum += num;
                count ++;
            }

            if(sum >1000){
                break;
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
