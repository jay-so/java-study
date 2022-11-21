package part27;

import java.util.Random;

interface Generaotr{
    int rand(); //매개변수 없는 메소드
}
public class NoParamAndReturn {
    public static void main(String[]args){
        Generaotr gen = ()->{
            Random random = new Random();
            return random.nextInt(50);
        };

        System.out.println(gen.rand());
    }
}
