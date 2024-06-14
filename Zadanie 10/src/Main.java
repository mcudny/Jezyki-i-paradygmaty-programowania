import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        double suma = 0;
        double a;
        System.out.println("Obliczanie sumy wpisanych liczb. Wpisz 0 aby zakończyć.");
        do{
            System.out.print("Podaj liczbę: ");
            a = sc.nextDouble();
            suma += a;
        }while(a !=0);
        System.out.println("Suma podanych liczb wynosi: " + suma);
        sc.close();
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Błąd: Podana wartość nie jest prawidłowa!");
        }
    }
}