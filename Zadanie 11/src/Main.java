import java.util.Scanner;
public  class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int suma = 0;
        int ilosc = 0;
        System.out.println("Wprowadz liczby całkowite. Aby zakończyć wpisz 0");
        while(true){
            System.out.print("Podaj liczby całkowite: ");
            while (!scanner.hasNextInt()){
                System.out.println("To nie jest liczba całkowita! Spróbuj ponownie.");
                scanner.next();
                System.out.print("Podaj liczby całkowite: ");
            }
            a = scanner.nextInt();
            if(a ==0){
                break;
            }
            if (a<min){
                min = a;
            }
            if (a>max){
                max = a;
            }
            suma += a;
            ilosc++;
        }
        double srednia = (double)suma/ilosc;
        System.out.println("Suma liczb wynosi: "+suma);
        System.out.printf("Wartosc arytmetyczna wynosi: %.2f",srednia);
    }
}
