package part6;

public class Problem6_2_2 {
    public static void main(String[]args){

        for(int i = 1;i<101;i++){
            if(discriminationPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean discriminationPrimeNumber(int n){
        if((n%2)==0){
            return false;
        }else{
            return true;
        }
    }

}
