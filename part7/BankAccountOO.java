package part7;

/*
클래스 BankAccount에 선언된 데이터, 기능

    인스턴스 변수 = 멤버, 필드 = 클래스 내에 선언된 변수
    인스턴스 메소드 = 클래스 내에 정의된 메소드

    인스턴스 변수의 특징 -> 같은 클래스 내에 위치한 모든 메소드에서 젒근이 가능하다.(인스턴스 변수 is Not 지역변수)

    클래스 = 틀
    틀을 통해 사물을 생성함 => 인스턴스화, 객체 생성(인스턴스 = 객체)
    new BankAccount() -> 인스턴스 생성, 객체 생성, BankAccount이라는 사물(객체)를 메모리에 생성함

    변수에서 살펴봤듯이 메모리에 만든 객체를 사용할 수 있도록 하는 변수가 필요하다. -> 참조 변수

   BanckAccount MyAcnt; //메모리에 객체를 참조할 myAcnt1이라는 변수를 선언하겠다.

   myAcnt1 = new BankAccount(); //참조 변수 myAcnt1에 BankAccount이라는 객체의 주소 값을 반환하겠습니다.

   new 키워드를 사용해서 인스턴스를 생성하면 생성된 인스턴스의 주솟값이 반환된다.
   한 문장으로
   BankAccount myAcnt1 = new BankAccount();
   BankAccount myAcnt2 = new BankAccount();

 */

/*
 클래스 = 틀 생성
 */
class BankAccount{
    int balance = 0; //예금 잔액


    public int deposit(int amount){
        balance += amount;
        return balance;
    }

    public  int withdraw(int amount){
        balance -= amount;
        return balance;
    }

    public int checkMyBalance(){
        System.out.println("잔액: " + balance);
        return balance;
    }


}


public class BankAccountOO {

    public static void main(String []args) {
        //2개의 인스턴스 생성
        BankAccount yoon = new BankAccount();
        BankAccount park = new BankAccount();

        //각 인스턴스를 대상으로 예금을 진행
        yoon.deposit(5000);
        park.deposit(3000);

        //각 인스턴스를 대상으로 출금을 진행
        yoon.withdraw(2000);
        yoon.withdraw(2000);

        //각 인스턴스를 대상으로 잔액을 조회
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
