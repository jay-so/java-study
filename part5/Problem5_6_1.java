package part5;

public class Problem5_6_1 {
    public static void main(String[]args){
        int count = 0;


        for(int num = 1;num<100;num++){
            if((num % 5 == 0) &&(num % 7==0)){ //num이 5와 7의 배수라면
                System.out.println(num);
                count++;
            }
        }
        System.out.println("count: " + count);
    }
}
