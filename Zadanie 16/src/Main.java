import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.print("Podaj liczbę całkowitą: ");
          int liczba = sc.nextInt();
        System.out.print("Dzielniki liczby "+ liczba + " to: ");
        for(int i = 1; i<=Math.abs(liczba); i++) {
            if(liczba%i == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
         catch (java.util.InputMismatchException e){
        System.out.println("Podana wartość nie jest prawidłowa!");
    }
    }
}