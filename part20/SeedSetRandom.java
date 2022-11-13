package part20;

import java.util.Random;

public class SeedSetRandom {
    public static void main(String[]args){
        Random random = new Random(System.currentTimeMillis());

        for(int i = 0;i<7;i++)
            System.out.println(random.nextInt(1000));
    }
}
