public class BankAccount {

    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double initialBalance){
        this.accountNumber=accountNumber;
        this.balance=initialBalance;
    }

    public void deposit_amount(double amount){
        if (amount>0)
        {
            balance=balance+amount;
            System.out.println(balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void withdraw_amount(double amount){
        if(amount>0 && amount<=balance)
        {
            balance=balance-amount;
            System.out.println(balance);
        }
        else{
            System.out.println("insufficeint");
        }
    }
    public void check_balance(){
        System.out.println(balance);

    }
    
}
