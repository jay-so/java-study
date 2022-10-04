package part10;

class AccessWay{
    static int num = 0;

    AccessWay(){
        incrtCnt();
    }
    void incrtCnt(){
        num ++;
    }
}

public class ClassVarAccess {
    public static void main(String[]args){
        AccessWay way = new AccessWay();
        way.num++;
        AccessWay.num++;
        System.out.println("num = " + AccessWay.num);
    }
}
