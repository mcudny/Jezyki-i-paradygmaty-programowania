import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        int propozycja;
        int proby = 0;
        System.out.println("Gra w Za dużo, za mało - zgadnij liczbę z zakresu od 1 do 100");
        do{
            System.out.print("Podaj propozycję liczby: ");
            propozycja = sc.nextInt();
            proby++;
            if(propozycja < n){
                System.out.println("Podałeś za małą wartość");
            } else if (propozycja>n) {
                System.out.println("Podałeś za dużą wartość");
            }
            else {
                System.out.println("Gratulacje");
            }
        }while (propozycja != n);
    }
}