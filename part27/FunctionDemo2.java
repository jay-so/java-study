package part27;

import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[]args){
        Function<Double,Double> cti = d ->d * 0.3939701;
        Function<Double,Double> itc = d -> d*2.54;
        System.out.println("1cm = " + cti.apply(1.0) + "inch"); //cm을 inch로
        System.out.println("1inch = " + itc.apply(1.0) + "cm"); //inch를 cm로
    }
}
