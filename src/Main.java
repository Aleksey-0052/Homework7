public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        }
    public static void task1() {
        System.out.println("Задача 1");

        int monthlySavingsAmount = 15000;
        int totalSavingsAmount = 0;
        while (totalSavingsAmount < 2_459_000) {
            totalSavingsAmount = totalSavingsAmount + monthlySavingsAmount;
            int i = totalSavingsAmount / 15000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSavingsAmount + " рублей");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");

        int a = 1;
        while (a < 11) {
            System.out.print(a + " ");
            a = a + 1;
        }
        System.out.println();
        for (int b = 10; b > 0; b = b - 1) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");

        int year = 2023;
        int totalPopulationOfCountry = 12000;
        int fertility = totalPopulationOfCountry / 1000 * 17;
        int mortality = totalPopulationOfCountry / 1000 * 8;
        while (year < 2033) {
            year = year + 1;
            totalPopulationOfCountry = totalPopulationOfCountry + fertility - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + totalPopulationOfCountry);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");

        int savingsAmount = 15000;
        int i = 0;
        while (savingsAmount < 12_000_000) {
            savingsAmount = savingsAmount + savingsAmount / 100 * 7;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsAmount + " рублей");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");

        int savingsAmount = 15000;
        int i = 0;
        while (savingsAmount < 12_000_000) {
            savingsAmount = savingsAmount + savingsAmount / 100 * 7;
            i = i + 1;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsAmount + " рублей");
            }
        }
        System.out.println(savingsAmount);
    }
    public static void task6 () {
        System.out.println("Задача 6");

        int savingsAmount = 15000;
        for (int i = 1; i <= 12 * 9; i++) {
            savingsAmount = savingsAmount + savingsAmount / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + savingsAmount + " рублей");
            }
        }
        System.out.println(savingsAmount);
    }
    public static void task7 () {
        System.out.println("Задача 7");

        for (int dayOfWeekFriday = 3; dayOfWeekFriday <= 31; dayOfWeekFriday = dayOfWeekFriday + 7) {
            System.out.println("Сегодня пятница, " + dayOfWeekFriday + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");

        int cometFlybyYear = 0;
        int currentYear = cometFlybyYear + 2023;
        int startYear = currentYear - 200;
        int finishYear = currentYear + 100;
        for (; cometFlybyYear < finishYear; cometFlybyYear = cometFlybyYear + 79) {
            if (startYear < cometFlybyYear) {
                System.out.println(cometFlybyYear);
            }
        }
    }
}