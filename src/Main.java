public class Main {
    public static void main(String[] args) {
        int balance = 0;
        int amount = 1500;
        int bonusThreshold = 100;
        int bonusPoints = 1;
        int bonus = 0;

        if (amount >= bonusThreshold) {
            bonus = amount / bonusThreshold * bonusPoints;
        }

        int totalAccount = balance + amount + bonus;
        
        System.out.println("Сумма пополнения: " + amount + " рублей");
        System.out.println("Начислено бонусов: " + bonus);
        System.out.println("Итоговый счёт: " + totalAccount + " рублей");
    }
}