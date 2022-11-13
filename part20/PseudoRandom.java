package part20;

import java.util.Random;

public class PseudoRandom {
    public static void main(String[]args){
        Random random = new Random(12);

        for(int i = 0;i<7;i++)
            System.out.println(random.nextInt(1000));
    }
}
