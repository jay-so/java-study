package part7;

public class BankAccountPO {
    static int balance = 0; //예금 잔액

    public static void main(String[]args){
        deposit(10000);// 예금
        checkMyBalance(); // 잔액 확인
        withdraw(3000); // 출금 진행
        checkMyBalance(); //잔액 확인
    }

    /*
    입금을 담당하는 메소드
     */
    public static int deposit(int amount){
        balance += amount;
        return balance;
    }

    /*
    출금을 담당하는 메소드
     */
    public static int withdraw(int amount){
        balance -= amount;
        return balance;
    }

    /*
    예금 조회를 담당하는 메소드
     */
    public static int checkMyBalance(){
        System.out.println("잔액 :" + balance);
        return balance;
    }
}
