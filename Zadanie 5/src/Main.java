import java.util.Scanner;

 public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         try {
         double cena = 0;
         int raty = 0;
         boolean wartosc = false;

         while (!wartosc){
             System.out.print("Podaj cenę towaru w zakresie od 100zł do 10 000 zł: ");
             cena = sc.nextDouble();
             if(cena >= 100 && cena <= 10000){
                 wartosc = true;
             }
             else {
                 System.out.println("Podana wartość jest poza zakresem. Spróbuj ponownie.");
             }
         }
         wartosc = false;
         while (!wartosc){
             System.out.print("Podaj liczbę rat w zakresie od 6 do 48: ");
             raty = sc.nextInt();
             if(raty >= 6 && raty <= 48){
                 wartosc = true;
             }
             else {
                 System.out.println("Podana wartość jest poza zakresem. Spróbuj ponownie.");
             }
         }
         double oprocentowanie = 0;
         if(raty >=6 && raty <= 12){
             oprocentowanie = 2.5;
         } else if (raty >= 13 && raty<= 24) {
             oprocentowanie = 5.0;
         }
         else if(raty>= 25 && raty <= 48){
             oprocentowanie = 10.0;
         }
         double odsetki = cena*(oprocentowanie/100);
         double kwota = cena + odsetki;
         double ratanamiesiac = kwota/raty;
         System.out.printf("Miesięczna rata wynosi: %.2f zł",ratanamiesiac);
         sc.close();
         }
         catch (java.util.InputMismatchException e){
             System.out.println("Podana wartość nie jest prawidłowa!!");
         }
     }
 }