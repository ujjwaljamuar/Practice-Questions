public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        this("56789", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String customerEmail,
            String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmail, customerPhoneNumber);
    }

    public void deposit(double depositAmount) {
        System.out.println("Current balance = " + this.balance);
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " processed. New balance is " + this.balance);
    }

    public void withdraw(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
            return;
        }
        System.out.println("Current balance = " + this.balance);
        this.balance -= withdrawalAmount;
        System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public class VipCustomer {
        private String name;
        private double creditLimit;
        private String emailAddress;

        public VipCustomer() {
            this("Default client name", 100.00, "default@email.com");
        }

        public VipCustomer(String name, double creditLimit) {
            this(name, creditLimit, "unknown@email.com");
        }

        public VipCustomer(String name, double creditLimit, String emailAddress) {
            this.name = name;
            this.creditLimit = creditLimit;
            this.emailAddress = emailAddress;
        }

        public String getName() {
            return name;
        }

        public double getCreditLimit() {
            return creditLimit;
        }

        public String getEmailAddress() {
            return emailAddress;
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", 0.00, "Alberto Morante", "alberto@gmail.com", "+34 5642324324");
        System.out.println(account1.getNumber());
        System.out.println(account1.getBalance());

        account1.withdraw(10);
        account1.deposit(30);
        account1.withdraw(40);
        account1.withdraw(20);

        BankAccount albertAccount = new BankAccount("Albert", "albert@gmail.com", "12345");
        System.out.println(albertAccount.getNumber() + " name " + albertAccount.getCustomerName());

        VipCustomer client1 = new VipCustomer();
        System.out.println(client1.getName());

        VipCustomer client2 = new VipCustomer("Albert", 25000.00);
        System.out.println(client2.getName());

        VipCustomer client3 = new VipCustomer("Other", 100.00, "other@email.com");
        System.out.println(client3.getName());
        System.out.println(client3.getEmailAddress());
    }
}
