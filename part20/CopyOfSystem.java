package part20;
class CopyOfSystem{
    public static void main(String[]args){
        double[]org = {1.1,2.2,3.3,4.4,5.5};
        double[] cpy = new double[3];

        //배열 org의 인덱스1에서 배열 cpy 인덱스0으로 3개의 요소를 복사
        System.arraycopy(org,1,cpy,0,3);

        for(double d: cpy){
            System.out.print(d + "\t ");
        }
        System.out.println();
    }
}
