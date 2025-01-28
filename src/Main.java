public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int amount = 1500;
        int account = amount + balance;

        if (account > 1000) {
            int procent = (amount / 100 * 1);
            System.out.println("Бонус: " + procent);
            System.out.println("Итоговый баланс: " + account);
        } else {
            System.out.println("Итоговый бонус:" + 0);
        }

        System.out.println();
    }

}