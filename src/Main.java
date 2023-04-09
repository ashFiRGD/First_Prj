import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Примитивы - int, float, double, boolean
        // Ссылочные - String, Integer, Double
        /*
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int i = 1;

        while (i*i<number) {
            System.out.println(i*i);
            i += 1;
        }
        */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 2;
        while (number % i != 0){
            i++;
        }
        System.out.println(i);
    }
}