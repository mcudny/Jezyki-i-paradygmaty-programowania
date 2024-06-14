import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        int A=0;
        int B=0;
        boolean input = false;
        while (!input) {
            System.out.print("Podaj liczbę całkowitą A: ");
            if(sc.hasNextInt()) {
                A = sc.nextInt();
                System.out.print("Podaj liczbę całkowitą B: ");
                if (sc.hasNextInt()) {
                    B = sc.nextInt();
                    if (A < B) {
                        input = true;
                    } else {
                        System.out.println("Błąd: Niespełnione założenie A < B! Spróbuj ponownie.");
                    }
                } else {
                    System.out.println("Błąd: Podana liczba nie jest całkowitą! Spróbuj ponownie.");

                    sc.next();
                }
            }
            else {
                System.out.println("Błąd: Podana liczba nie jest całkowitą! Spróbuj ponownie.");
                sc.next();
            }

        }
        int sumaW = 0;
        int i = A;
        while (i <= B) {
            sumaW += i;
            i++;
        }

        int sumaDW = 0;
        int j = A;
        do {
            sumaDW += j;
            j++;
        }
        while (j <= B);

        int sumaF =0;
        for(int k = A; k<=B; k++){
            sumaF += k;
        }
        System.out.println("Suma ciągu za pomocą pętli while: " + sumaW);
        System.out.println("Suma ciągu za pomocą pętli do-while: " + sumaDW);
        System.out.println("Suma ciągu za pomocą pętli for: " + sumaF);
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Błąd: Wprowadzono znak nie liczbę!");
        }
        sc.close();
    }
}