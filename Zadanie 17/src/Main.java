import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        int n;
        do {
            System.out.print("Podaj liczbę całkowitą większą od 1: ");
            while (!scanner.hasNextInt()) {
                System.out.print("To nie jest liczba całkowita. Podaj liczbę całkowitą większą od 1: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 1);
        boolean pierwsza = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                pierwsza = false;
                break;
            }
        }
        if (pierwsza) {
            System.out.println(n + " jest liczbą pierwszą.");
        } else {
            System.out.println(n + " nie jest liczbą pierwszą.");
        }
        scanner.close();
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Podana wartość nie jest prawidłowa!");
        }
    }
}
