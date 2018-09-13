public class BankAccount {

    private int balance;//잔액 변수
    private Person owner;//변수 owner의 자료형은 Person이다.
    private Person to;

    public void setBalance(int newBalance){

        balance = newBalance;

    }

    public int getBalance(){

        return balance;

    }

    public void setOwner(Person newOwner){

        owner = newOwner;

    }

    public Person getOwner(){

        return owner;

    }

    //입금(deposit)
    //파라미터 : 받은 금액(amount)
    //리턴 : 성공여부(불린)
    boolean deposit(int amount){

        if(amount < 0 || owner.getCashAmount() < amount){

            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;

        }

        else {

            owner.setCashAmount(owner.getCashAmount() - amount);
            balance = balance + amount;
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;

        }

    }

    //출금(withdraw)
    //파라미터 : 나간 금액(amount)
    //리턴 : 성공여부(불린)
    boolean withdraw(int amount) {

        if(amount < 0 || amount > balance){

            System.out.println("출금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return false;

        }

        else {

            balance = balance - amount;
            owner.setCashAmount(owner.getCashAmount() + amount);
            System.out.println(amount + "원 출금하였습니다. 잔고: " + balance + "원, 현금: " + owner.getCashAmount() + "원");
            return true;

        }

    }

    //이체(transfer)
    //첫 번째 파라미터 : 받는 사람(person)
    //두 번째 파라미터 : 이체금액(amount)
    //리턴 : 성공여부(불린)
    boolean transfer(Person to, int amount){

        return transfer(to.getAccount(), amount);

    }



    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {

        boolean success;

        if (amount < 0 || amount > balance) {

            success = false;

        } else {

            balance = balance - amount;
            to.balance = to.balance + amount;
            success = true;

        }

        System.out.println(success + " - from: " + owner.getName() + ", to: " + to.owner.getName() + ", amount: " + amount + ", balance: " + balance);
        return success;

    }

    public BankAccount (int pBalance){

        balance = pBalance;
        if (pBalance < 0){

            balance = 0;

        }

    }

    public BankAccount (Person pOwner){

        owner = pOwner;
        balance = 0;

    }

    public BankAccount (int pBalance, Person pOwner){

        balance = pBalance;
        owner = pOwner;
        if (pBalance < 0){

            balance = 0;

        }

    }
}


