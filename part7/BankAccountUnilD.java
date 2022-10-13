package part7;

/*
이전에 본 BankAccount는 인스턴스를 구분할 수 있는 정보가 빠졌다.
따라서 위의 클래스에는 최소한 다음 두 가지의 정보는 추가되어야 한다. -> 그래야 누구의 계좌인지 구분할 수 있다.
- 계좌번호 = String accNumber
- 주민번호 = String ssNumber

아래의 클래스에서는 다음 메소드가 추가되었다.
- 다음 메소드는 다른 메소드들과의 성격상 구분된다.
- 인스턴스의 초기화를 위한 메소드이다.
- 때문에 인스턴스 생성 시 반드시 호출해서 초기화를 진행 해야 한다.
public void initAccount(String acc, String ss, int bal){
        accNumber = acc;
        ssNumber = ss;
        balance = bal; //계좌 개설 시 예금액으로 초기화
    }

-> 그러나 위와 같은 메소드를 정의하지 않고 생성자라는 것을 정의해서 인스턴스의 초기화를 진행할 수 있다.
-> 생성자는 인스턴스 생성 과정에서 초기화를 위해 자동으로 호출되는 일종의 메소드이다.
 */

class BankAccount4{
    String accNumber; //계좌번호
    String ssNumber; //주민번호
    int balance = 0; //예금 잔액

    /*
    초기화를 위한 메소드
    */
    public void initAccount(String acc, String ss, int bal){
        accNumber = acc;
        ssNumber = ss;
        balance = bal; //계좌 개설 시 예금액으로 초기화
    }

    public int deposit(int amount){
        balance += amount;
        return balance;
    }

    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }

    public int checkMyBalance(){
        System.out.println("계좌번호: " + accNumber);
        System.out.println("주민번호: " + ssNumber);
        System.out.println("잔 액 : " + balance + '\n');
        return balance;
    }
}



public class BankAccountUnilD {
    public static void main(String[]args){
        BankAccount4 yoon = new BankAccount4();// yoon의 계좌 생성
        yoon.initAccount("12-34-89","990990-9090990",10000); //초기화

        BankAccount4 park = new BankAccount4(); // park의 계좌 생성
        park.initAccount("33-55-04","77088-595907",10000); //초기화

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }

}
