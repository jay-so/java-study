package part5;

public class BreakPoint {
    public static void main(String[]args){
        for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                if((i*j ) == 72){
                    System.out.println(i + " x " + j + " = " + i*j);
                    break;
                }
            }
        }
    }
}
