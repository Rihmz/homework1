public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        }
    public static void printThreeWords() {
        System.out.println("№2");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        System.out.println("№3");
        byte a = 20;
        byte b = -31;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
    } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        System.out.println("№4");
        int value = 300;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else if (value > 100) {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() {
        System.out.println("№5");
        int a = 2;
        int b = 17;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    }