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
}

class ColdPatinet2{
    void takeSinus(SinivelCap cap){
        cap.take();
    }
}

public class OneClassEncapulation {
    public static void main(String[]args){
        ColdPatinet2 suf = new ColdPatinet2();
        suf.takeSinus(new SinivelCap());
    }
}
