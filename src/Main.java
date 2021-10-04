public class Main {
    public static void main(String[] args) {
        int openingBalance = 100;
        int replenishmentBalance = 1100;
        int amountBonus;
        if (replenishmentBalance > 1000) {
            amountBonus = replenishmentBalance / 100;
        } else {
            amountBonus = 0;
        }
        int totalBalance = openingBalance + replenishmentBalance + amountBonus;
        System.out.println("Итоговый счет: " + totalBalance);
        System.out.println("Кол-во бонусов: " + amountBonus);
    }
}
