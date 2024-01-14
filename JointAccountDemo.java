package labno5;

public class JointAccountDemo {
    public static void main(String[] args) {
        JointAccount account = new JointAccount();

        AccountHolder holder1 = new AccountHolder(account, "Account Holder 1");
        AccountHolder holder2 = new AccountHolder(account, "Account Holder 2");

        Thread thread1 = new Thread(holder1);
        Thread thread2 = new Thread(holder2);

        thread1.start();
        thread2.start();
    }
}
