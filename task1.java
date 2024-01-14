package labno5;

class JointAccount {
    private int balance = 0;

    public void deposit(int amount, String accountHolder) {
        synchronized (this) {
            System.out.println(accountHolder + " is depositing $" + amount);
            balance += amount;
            
        }
    }

    public void withdraw(int amount, String accountHolder) {
        synchronized (this) {
            if (balance >= amount) {
                System.out.println(accountHolder + " is withdrawing $" + amount);
                balance -= amount;
               
            } else {
                System.out.println(accountHolder + ": Insufficient funds for withdrawal.");
            }
        }
    }
}

class AccountHolder implements Runnable {
    private JointAccount jointAccount;
    private String name;

    public AccountHolder(JointAccount jointAccount, String name) {
        this.jointAccount = jointAccount;
        this.name = name;
    }

    @Override
    public void run() {
    	
    
        for (int i = 0; i < 1; i++) {
            int depositAmount =  50000 ;
            jointAccount.deposit(depositAmount, name);

            int withdrawAmount = 45000;                 
         
            jointAccount.withdraw(withdrawAmount, name);
            

            
        

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


