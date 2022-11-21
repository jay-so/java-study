package part27;

import java.util.function.Function;

public class FuncionDemo {
    public static void main(String[]args){
        Function<String,Integer> f= s -> s.length();
        System.out.println(f.apply("Robot"));
        System.out.println(f.apply("System"));
    }
}
