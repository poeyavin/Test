package Task1_9;

public class Main {
    public static void main(String args[]) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        positiveNumber(-7);
        printString("Бананакин Скайуокер", 5);

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }


    public static void checkSumSign() {
        int a = 5;
        int b = -7;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = -9;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        }
        else
            System.out.println("Зеленый");
    }


    public static void compareNumbers() {
        int a = 5;
        int b = -7;
        if (a >= b) {
            System.out.println("a>=b");
        } else
            System.out.println("a<b");
    }

    public static boolean number10To20 (int a , int b) {
        int sum = a + b;
        return sum >= 10 & sum <= 20;
    }

    public static void positiveNumber(int num) {
        if (num >= 0) {
            System.out.println("num положительное число");
        } else {
            System.out.println("num отрицательное число");
        }

    }

    public static boolean negativeNumber(int num) {
        return num < 0;
    }

    public static void printString(String str, int num) {
        int i;
        for (i = 0; i < num; i++) {
            System.out.println(str);
        }
    }

    public static boolean leapYear(int n) {
        if (n % 100 != 0 & n % 400 == 0) {
            return true;
        } else if (n % 100 == 0) {
            return false;
        } else {
            return n % 4 == 0;
        }
    }

}














            




