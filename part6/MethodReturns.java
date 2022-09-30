package part6;

public class MethodReturns {
    public static void main(String[]args){
        int result;
        result = adder(4,5);
        System.out.println("4 + 5 = " + result);
        System.out.println("3.5 x 3.5 =" + sqaure(3.5));
    }

    public static int adder(int num1, int num2){
        int addResult = num1+num2;
        return addResult;
    }

    public static double sqaure(double num){
        return num * num;
    }
}

