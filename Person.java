public class Person {

    private String name;
    private int age;
    private int cashAmount;
    private BankAccount account;//account변수는 BankAccount가 자료형이다.

    public void setName(String newName) {

        name = newName;

    }

    public String getName() {

        return name;

    }

    public void setAge(int newAge) {

        if (newAge > 0) {

            age = newAge;

        }

    }

    public int getAge() {

        return age;

    }

    public void setCashAmount(int newCashAmount) {

        cashAmount = newCashAmount;

    }

    public int getCashAmount() {

        return cashAmount;

    }

    public void setAccount(BankAccount newAccount) {

        account = newAccount;

    }

    public BankAccount getAccount() {

        return account;

    }

    //이체(transfer)
    //첫 번째 파라미터 : 받는 사람(person)
    //두 번째 파라미터 : 이체금액(amount)
    //리턴 : 성공여부(불린)
    boolean transfer(Person to, int amount) {

        return account.transfer(to.getAccount(), amount);

    }

    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {

        return account.transfer(to, amount);

    }

    public Person (String pName, int pAge){

        name = pName;
        age = pAge;
        cashAmount = 0;
        if(pAge < 0){

            age = 12;

        }

    }

    public Person(String pName, int pAge, int pcashAmount){

        name = pName;
        age = pAge;
        cashAmount = pcashAmount = 0;
        if (pAge < 0){

            age = 12;

        }

        if (pcashAmount < 0){

            cashAmount = 0;

        }

    }
}
