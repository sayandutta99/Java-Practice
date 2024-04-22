public class BankAccountApplication {
    public static void main(String[] args) {

        BankAccount rbsAccount1 = new BankAccount(101, 10000);
        //rbsAccount1.accountNumber= 101;
        //rbsAccount1.balance = 1000.00;
        rbsAccount1.deposit_amount(2500);
        rbsAccount1.withdraw_amount(100);
        rbsAccount1.check_balance();
        rbsAccount1.deposit_amount(10000.00);

        BankAccount rbsAccount2= new BankAccount(102, 50000);
        //rbsAccount2.accountNumber=102;
        //rbsAccount2.balance= 50000.00;
        rbsAccount2.withdraw_amount(51000.00);
        rbsAccount2.check_balance();
        
    }
    
}
