package part7;

/*
  클랙스 = 데이터(Data) + 메소드(Method)
  데이터(Data) = 변수 balance는 프로그램 상에서 유지하고 관리해야 할 데이터
  기능 (Method) = 행동, 데이터를 처리하고 조작하는 기능
 */

public class BankAccountPO {
    static int balance = 0; //예금 잔액

    public static void main(String[]args){
        deposit(10000); //입금 진행
        checkMyBalance(); //잔액 확인
        withdraw(3000); //출금 진행
        checkMyBalance(); //잔액 확인
    }

    //입금을 담당하는 메소드
    public static int deposit(int amount){
        balance += amount;
        return balance;
    }

    //출금을 담당하는 메소드
    public static int withdraw(int amount){
        balance -= amount;
        return balance;
    }

    //예금 조회를 담당하는 메소드
    public static int checkMyBalance(){
        System.out.println("잔액: " + balance);
        return balance;
    }

}
