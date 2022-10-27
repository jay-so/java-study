package part11;
/*
 생성자의 오버로딩
 */
class Person{
    private  int regiNum;
    private  int passNum;

    Person(int rnum, int pnum){
        regiNum = rnum; //주민등록 번호
        passNum = pnum; //여권 번호
    }

     Person(int rnum){
        regiNum = rnum;
        passNum = 0;
     }

     void showPersonalInfo(){
        System.out.println("주민등록 번호: " + regiNum);

        if(passNum != 0)
            System.out.println("여권 번호 : " + passNum + "\n");
        else
            System.out.println("여권을 가지고 있지 않습니다. \n");
     }
}

public class ConOverloading {
    public static void main(String[]args){
        //여권이 있는 사람의 정보를 담은 인스턴스 생성
        Person jung = new Person(335577,112233);

        //여권이 없는 사람의 정보를 담은 인스턴스 생성
        Person hong = new Person(775544);

        jung.showPersonalInfo();
        hong.showPersonalInfo();
    }
}
