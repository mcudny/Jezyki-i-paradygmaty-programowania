import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj znak wypełnenia: ");
        char znak = sc.next().charAt(0);
        System.out.print("Podaj współrzędną x (lewy górny róg prostokąta): ");
        int x = sc.nextInt();
        System.out.print("Podaj współrzędną y (lewy górny róg prostokąta): ");
        int y = sc.nextInt();
        System.out.print("Podaj długość boku a prostokąta: ");
        int a = sc.nextInt();
        System.out.print("Podaj długość boku b prostokąta: ");
        int b = sc.nextInt();
        for (int i = 1; i <= y+b-1; i++) {
            for (int j = 1; j <= x+a-1; j++) {
                if(i>=y && i< y+b && j>=x && j<x + a){
                    System.out.print(znak);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}