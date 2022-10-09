public class Main {
    public static void main(String[] args) {
        int balance = 1000;
        int payment = 3200;
        boolean upThousand = payment > 1000;
        int bonus;
        if (upThousand) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговая сумма на счёте:");
        System.out.println(balance + payment + bonus);
        System.out.println("Начисленные бонусы:");
        System.out.println(bonus);

    }
}