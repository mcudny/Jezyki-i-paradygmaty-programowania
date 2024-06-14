import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        int n;
        while (true) {
            System.out.print("Podaj wysokość choinki: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if(n>=0){
                    break;
                }
                else{
                    System.out.println("Podana liczba musi być większa niż 0.");
                }
            }
            else {
                System.out.println("Podana liczba nie jest całkowita! Spróbuj ponownie.");
                sc.next();
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Podana wartość nie jest prawidłowa!");
        }
    }
}