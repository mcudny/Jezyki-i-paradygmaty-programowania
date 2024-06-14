import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Podaj pierwszą liczbę całkowitą: ");
            int a = scanner.nextInt();
            System.out.print("Podaj drugą liczbę całkowitą: ");
            int b = scanner.nextInt();
            System.out.print("Podaj trzecią liczbę całkowitą: ");
            int c = scanner.nextInt();
            scanner.close();
           int max;
           if (a >= b && a>=c) {
               max = a;
           }
           else if (b >= a && b>=c) {
               max = b;
           }
           else {
               max = c;
           }
           int min;
           if (a <= b && a <=c) {
               min = a;
           }
           else if (b <= a && b <=c) {
               min = b;
           }
           else{
               min = c;
           }
           System.out.println("Największa liczba to: " +max);
           System.out.println("Najmniejsza liczba to: " +min);
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Podana wartość nie jest prawidłowa!!");
        }
    }
}
