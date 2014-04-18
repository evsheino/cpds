public class Account {

    private int balance = 0;

    public Account() { }

    public synchronized boolean withdraw(int amount) throws InterruptedException {
        if (balance-amount < 0) wait();
        balance -= amount;
        System.out.println("balance:" + balance);
        return true;
    }

    public synchronized boolean deposit(int amount) {
        if (amount <= 0) return false;
        balance += amount;
        System.out.println("balance:" + balance);
        notifyAll();
        return true;
    }
}

