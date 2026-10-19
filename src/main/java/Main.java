import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj a:");
        int a = skaner.nextInt();
        System.out.println("Podaj b:");
        int b = skaner.nextInt();
        int suma = a + b;
        System.out.println("Suma to: " + suma);
    }
}