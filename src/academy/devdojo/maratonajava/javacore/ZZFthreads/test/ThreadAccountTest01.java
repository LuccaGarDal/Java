package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Andrew");
        Thread t2 = new Thread(threadAccountTest01, "Tobey");

        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("SALDO NEGATIVO");
            }

        }
    }

    private void withdrawal(int amount) {
        System.out.println(getThreadName() + " Fora do sync");
        synchronized (account) {
            System.out.println(getThreadName() + " Dentro do sync");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " está indo sacar");
                account.withdrawal(amount);
                System.out.println(getThreadName() + " completou o saque, o valor atual do saldo é: " + account.getBalance());
            } else {
                System.out.println("O valor " + amount + " é maior que o saldo");
            }
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }

}
