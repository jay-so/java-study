package part9;

class SinusCap{
    void sniTake(){
        System.out.println("콧물이 싹~ 납니다.");
   }
    void sneTake(){
        System.out.println("재채기가 멎습니다.");
    }
    void  snuTake(){
        System.out.println("코가 뻥 뚫립니다.");
    }

    void take(){ //약의 복용 방법 및 순서가 담긴 메소드
        sniTake();
        sneTake();
        snuTake();
    }
}

class ColdPatinet2{
    void takeSinus(SinusCap cap){
        cap.take();
    }
}

public class OneClassEncapulation {
    public static void main(String[]args){
        ColdPatinet2 suf = new ColdPatinet2();
        suf.takeSinus(new SinusCap());
    }
}
