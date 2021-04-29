public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public BankAccount(String number,double balance,String customerName,String customerEmailAddress,String customerPhoneNumber){
        System.out.println("Informations");
        this.number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.customerEmailAddress=customerEmailAddress;
        this.customerPhoneNumber=customerPhoneNumber;

    }
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of ₹ "+depositAmount+" is successful. New balance is ₹ "+this.balance+".");
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only ₹ " + this.balance + " available. So, Fuck off LOSER! ");
        } else{
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of ₹ "+withdrawalAmount+" is successful. Remaining Balance is ₹ "+this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public static void main(String[] args) {

        BankAccount ujjwalsAccount=new BankAccount("1",0.00,"Ujjwal Jamuar","ujjwalj12222@gmail.com","+91 8083528192");
        ujjwalsAccount.setNumber("1");
        ujjwalsAccount.setCustomerName("Ujjwal Jamuar");
        ujjwalsAccount.setCustomerEmailAddress("ujjwalj12222@gmail.com");
        ujjwalsAccount.setCustomerPhoneNumber("+91 8083528192");
        ujjwalsAccount.withdrawal(50000);
        ujjwalsAccount.deposit(1000000);
        ujjwalsAccount.withdrawal(50000);
    }
}
