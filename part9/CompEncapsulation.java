package part9;

class SinivelCap2{ //콧물 처치용 캡슐
    void take(){
        System.out.println("콧물이 싹 ~ 납니다.");
    }
}

class SneezeCap2{ //재채기 처리용 캡슐
    void take(){
        System.out.println("재채기가 맺습니다.");
    }
}

class SnuffleCap2{ //코막힘 처치용 캡슐
    void take(){
        System.out.println("코가 뻥 뚫립니다.");
    }
}

class SinusCap2{
    SinivelCap2 siCap = new SinivelCap2();
    SneezeCap2 szCap = new SneezeCap2();
    SnuffleCap2 sfCap = new SnuffleCap2();

    void take() {
        siCap.take();
        szCap.take();
        sfCap.take();
    }
}

class ColdPatient3{
    void takeSinus(SinusCap2 cap){
        cap.take();
    }
}



public class CompEncapsulation {
    public static void main(String[]args){
        ColdPatient3 suf = new ColdPatient3();
        suf.takeSinus(new SinusCap2());
    }
}
