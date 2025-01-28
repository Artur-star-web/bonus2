public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int amount = 1100;
        int account = amount + balance;

        int bonus;
        if (account > 1000) {
            bonus = (amount / 100);
            System.out.println("Бонус: " + bonus);
            System.out.println("Итоговый баланс: " + (account + bonus));
        } else {
            bonus = 0;
            System.out.println("Итоговый бонус:" + bonus);
        }
    }

}