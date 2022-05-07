public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int bonus = 0;
        int replenishment = 1100;
        if (replenishment < 1000) {
            bonus = 0;
        } else {
            bonus = replenishment / 100;
        }
        int balanceAfterReplenishmant = balance + replenishment + bonus;
        System.out.println("Итоговый баланс: " + balanceAfterReplenishmant);
        System.out.println("Из них бонусы: " + bonus);
    }
}
