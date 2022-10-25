public class Main {
    private static int bonus;

    public static void main(String[] args) {
        int account = 100;
        int deposit = 1500;
        int bonus;
        int total;

        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;

        }
        total = account + deposit + bonus;
        System.out.println("итоговая сумма " + total);

        System.out.println("начисление бонусов " + bonus);
    }
}