package academy.devdojo.maratonajava.javacore.ZZFthreads.dominio;

public class Account {
    private int balance = 50;

    public int  getBalance() {
        return balance;
    }

    public void withdrawal (int amount) {
        this.balance -= amount;
    }
}
