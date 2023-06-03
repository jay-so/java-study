package part11;
/*
 생성자의 오버로딩
 */

class Person{
    private int regiNum; //주민번호
    private int passNum; //여권 번호

    public Person(int regiNum, int passNum) {
        this.regiNum = regiNum;
        this.passNum = passNum;
    }

    public Person(int regiNum) {
        this.regiNum = regiNum;
        this.passNum = 0;
    }

    void showPersonalInfo(){
        System.out.println("주민등록 번호: " +regiNum);

        if(passNum != 0){
            System.out.println("여권 번호 : " + passNum + "\n");
        }else {
            System.out.println("여권을 가지고 있지 않습니다. \n");
        }
    }
}

public class ConOverloading {
    public static void main(String[] args) {
        SimpleBox box = new SimpleBox(99);
        System.out.println(box.getData());

        box.setData(77);
        System.out.println(box.getData());
    }
}
