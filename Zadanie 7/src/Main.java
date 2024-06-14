import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        int a= 0;
        boolean dodatnia = false;

        while (!dodatnia){
            System.out.print("Podaj liczbę całkowitą dodatnią: ");
            if(sc.hasNextInt()) {
                a = sc.nextInt();
                if (a > 0) {
                    dodatnia = true;
                } else {
                    System.out.println("Błąd: Podana liczba nie jest dodatnia! Spróbuj ponownie.");
                }
            }
            else {
                System.out.println("Błąd: Podana liczba nie jest całkowitą! Spróbuj ponownie.");
                sc.nextLine();
            }
        }
        System.out.println("Liczby nieparzyste nie większe niż: "+a+":");
        for (int i=1; i<=a; i+=2) {
            System.out.print(i+ " ");
        }
    }
        catch (java.util.InputMismatchException e){
        System.out.println("Błąd: Wprowadzono znak nie liczbę!");
    }
        sc.close();
    }
}