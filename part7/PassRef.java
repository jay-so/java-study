package part7;

/*
참조 변수의 매개변수 선언
- 메소드를 호출할 때 값을 전달할 수 있고, 이 값은 매개변수를 통해 값을 전달한다.
- 이와 유사하게 메소드를 호출하면서 인스턴스의 참조값을 전달하는 것도 가능하다.
 */
class BankAccount3{
    int balance = 0; //예금 잔액

    public int deposit(int amount){
        balance += amount;
        return balance;
    }
    public int withdraw(int amount){
        balance -= amount;
        return balance;
    }
    public int checkMyBalance(){
        System.out.println("잔액 : " + balance);
        return balance;
    }
}


public class PassRef {
   public static void main(String[] args){
       BankAccount3 ref = new BankAccount3();
       ref.deposit(3000);
       ref.withdraw(300);
       check(ref); //'참조 값'의 전달
   }

   public static void check(BankAccount3 acc){
       acc.checkMyBalance();
   }
}
