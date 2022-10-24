package part9;

class SinivelCap{ //콧물 처치용 캡슐
    void take(){
        System.out.println("콧물이 싹~ 납니다.");
    }
}

class SneezeCap{  //재채기 처치용 캡슐
    void take(){
        System.out.println("재채기가 맺습니다.");
    }
}

class SnuffleCap{ //코막힘 처치용 캡슐
    void take(){
        System.out.println("커기 빵 뚫립니다.");
    }
}

class  ColdPatinet{
    void takeSinivelCap(SinivelCap cap){
        cap.take();
    }
    void takeSneezeCap(SneezeCap cap){
        cap.take();
    }
    void takeSnffleCap(SnuffleCap cap){
        cap.take();
    }
}


public class BadEnxapsulatin {
    public static void main(String[]args){
        ColdPatinet suf = new ColdPatinet();

        //콧물 캡슐 구매 후 복용
        suf.takeSinivelCap(new SinivelCap());

        //재채기 캡슐 구매 후 복용
        suf.takeSneezeCap(new SneezeCap());

        //코막힘 캡슐 구매 후 복용
        suf.takeSnffleCap(new SnuffleCap());
    }
}
