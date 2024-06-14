import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        int n;
        while(true){
            System.out.print("Podaj dodatnią liczbę całkowitą: ");
            if(sc.hasNextInt()){
                n = sc.nextInt();
                if(n>0){
                    break;
                }
                else{
                    System.out.println("Błąd: Liczba musi być dodatnia! Spróbuj ponownie.");
                }
            }
            else {
                System.out.println("Błąd: Podana liczba nie jest całkowitą! Spróbuj ponownie.");
                sc.next();
            }
        }
        System.out.println("Potęgi liczby 2 nie większe niż: " + n + " ");
        int p = 1;
        while(p<=n){
            System.out.println(p + " ");
            p *= 2;
        }
    }
        catch (java.util.InputMismatchException e){
        System.out.println("Błąd: Wprowadzono znak nie liczbę!");
    }
        sc.close();
    }
}