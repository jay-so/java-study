package part7;

/*
 생성자는 메소드와 모습이 비슷하게 보이나 똑같진 않다.
 아래는 생성자가 되기 위한 조건이다.
 - 생성자의 이름은 클래스의 이름과 동일해야 한다.
 - 생성자는 값을 반환하지 않고 반환형도 표시하지 않는다.

 생성자를 생략한 상태의 클래스를 정의하면 자바 컴파일러가 '디폴트 생성자'라는 것을 클래스의 정의에 넣어준다.
    public BankAccount5() {
    //비어 있다.
    }
 -> 디폴트 생성자는 인자를 전달받지 않는 형태로 정의되어 삽입된다.

 클래스의 이름 규칙
 - 클래스의 이름을 지을 때 가장 보편적으로 선택하는 이름 규칙을 가리켜 'Camel Case 모델'이라고 한다.
 그리고 이 모델의 기본 규칙은 다음과 같다.
 1. 클래스 이름의 첫 문자는 대문자로 시작한다.
 2. 둘 이상의 단어가 묶여ㅑ서 하나의 이름을 이룰 때, 새로 시작하는 단어는 대문자로 한다.
 */

class BankAccount5{
    String accNumber; //계좌번호
    String ssNumber; //주민번호
    int balance; //예금

    public BankAccount5(String accNumber, String ssNumber, int balance) {
        this.accNumber = accNumber;
        this.ssNumber = ssNumber;
        this.balance = balance;
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

public class BankAccountConstructor {
    public static void main(String[]args){
        BankAccount5 yoon = new BankAccount5("12-34-89","990990-9090990",10000);// yoon의 계좌 생성

        BankAccount5 park = new BankAccount5("33-55-04","77088-595907",10000); // park의 계좌 생성

        yoon.deposit(5000);
        park.deposit(3000);
        yoon.withdraw(2000);
        park.withdraw(2000);
        yoon.checkMyBalance();
        park.checkMyBalance();
    }
}
