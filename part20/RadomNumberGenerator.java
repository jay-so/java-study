package part20;

import java.util.Random;

public class RadomNumberGenerator {
    public static void main(String[]args){
        Random random = new Random();

        for(int i = 0;i<7;i++)
            System.out.println(random.nextInt()); //0이상 1000미만 난수 생성

    }
}
