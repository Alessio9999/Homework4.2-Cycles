public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
    }

    private static void Task1() {
        System.out.println("\nЗадача 1:");
        int salary = 15_000;
        long maxDeposit = 2_459_000;
        long deposit = 0;
        int months = 0;

        while (deposit < maxDeposit) {
            deposit = deposit + salary;
            System.out.println("Месяц " + (++months) + " , сумма накоплений равна " + deposit + " рублей");
        }
    }

    private static void Task2() {
        System.out.println("\nЗадача 2:");
        byte i = 0;
        byte n = 10;
        while (i < n) System.out.print(++i + " ");
        System.out.println();
        for(i=n;i>0;i--) System.out.print(i + " ");
    }

    private static void Task3() {
        System.out.println("\n\nЗадача 3:");
        byte fertility = 17;
        byte mortality = 8;
        byte naturalIncPopulation = (byte) (fertility - mortality);
        float population = 12_000_000;
        byte n = 10;
        for (byte i=1; i<=n; i++) {
            population = population + population * naturalIncPopulation / 1000;
            System.out.println("Год " + i + ", численность населения составляет " + (int) population);
        }

    }

    private static void Task4() {
        System.out.println("\nЗадача 4:");
        double total = 15_000;
        double difference = 1.07;
        int month = 0;
        while (total < 12_000_000) {
            total *= difference;
            System.out.println("Месяц: " + ++month + ", сумма = " + (int) total);
        }

    }

    private static void Task5() {
        System.out.println("\nЗадача 5:");
        double total = 15_000;
        double diff = 1.07;
        int month = 1;
        while (total < 12_000_000) {
            total *= diff;
            if (month %6 == 0) System.out.println("Месяц: " + month + ", сумма = " + (int) total);
            month++;
        }
    }

    private static void Task6() {
        System.out.println("\nЗадача 6:");
        double total = 15_000;
        double diff = 1.07;
        int month = 1;
        int maxMonth = 9 * 12;
        while (month <= maxMonth) {
            total *= diff;
            if (month %6 == 0) System.out.println("Месяц: " + month + ", сумма = " + (int) total);
            month++;
        }
    }

    private static void Task7() {
        System.out.println("\nЗадача 7:");
        byte friday = 5;
        for (byte i = friday; i <= 31; i+=7)
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
    }

    private static void Task8() {
        System.out.println("\nЗадача 8:");
        short startYear = 2023 - 200;
        short finishYear = 2023 + 100;
        for (short year = startYear; year <= finishYear; year++)
            if (year % 79 == 0) System.out.println(year);
    }

}