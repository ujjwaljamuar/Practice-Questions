class Account:
    def __init__(self,owner,balance=0):
        self.owner=owner
        self.balance=balance
    def deposit(self,dep_amt):
        self.balance=self.balance+dep_amt
        print(f'Added {dep_amt} to the balance.' )
        print(f'Current balance is {self.balance}.')
    def withdraw(self,wd_amt):
        self.wd_amt=wd_amt
        if self.balance>=self.wd_amt:
            self.balance=self.balance-wd_amt
            print('Withdrawal Accepted.')
        else:
            print('Not enough money loser! Go Away. ')

    def __str__(self):
        return f"Owner : {self.owner} \nBalance : {self.balance}"

acct1 = Account('Jose',100)
print(acct1)
acct1.owner
acct1.balance
acct1.deposit(50)
acct1.withdraw(75)

acct1.withdraw(500)