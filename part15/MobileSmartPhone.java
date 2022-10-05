package part15;
class MobilePhone{
    protected String number;

    public MobilePhone(String num) {
        this.number = num;
    }
    public void anser(){
        System.out.println("Hi~ from " + number);
    }
}

class SmartPhone extends MobilePhone{
    private String androidVer;

    public SmartPhone(String num, String androidVer) {
        super(num);
        this.androidVer = androidVer;
    }
    public void playApp(){
        System.out.println("App is running in " + androidVer);
    }
}



public class MobileSmartPhone {
    public static void main(String []args){
        SmartPhone phone = new SmartPhone("010-555-777","Nougat");
        phone.anser();
        phone.playApp();
    }

}
