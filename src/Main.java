public class Main {
    public static void main(String[] args) {
        int initialAccount = 200; //изначальный баланс счета
        int amount = 3660; //сумма пополнения счета
        int unitPrice = 100; //стоимость одного бонусного рубля
        int margin = 1000; //минимальная сумма пополнения, при которой начисляются бонусы

        int account; //итоговый баланс счета
        int bonus; //количество бонусных рублей
        if (amount > margin) {
            bonus = amount / unitPrice;
            account = initialAccount + amount + bonus;
        } else {
            bonus = 0;
            account = initialAccount + amount;
        }

        System.out.println("Итоговый баланс счета: " + account);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}