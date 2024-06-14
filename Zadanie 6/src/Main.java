import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.println("Oto prosty kalkulator wykonujący: \n- Dodawanie \n- Odejmowanie \n- Mnożenie \n- Dzielenie");
        System.out.print("Podaj pierwszą liczbę: ");
        double a = sc.nextDouble();
        System.out.println("Podaj symbol operacji: \n+ (dodawanie) \n- (odejmowanie)\n* (mnożenie)\n/ (dzielenie)");
        System.out.print("Symbol: ");
        char key = sc.next().charAt(0);
        System.out.print("Podaj drugą liczbę: ");
        double b = sc.nextDouble();

        double result = 0;
        boolean action = true;
        switch (key) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if(b != 0) {
                    result = a / b;
                }
                else{
                    System.out.println("Błąd: Dzielenie przez zerio!");
                    action = false;
                }
                break;
            default:
                System.out.println("Błąd: Nieznany symbol!");
                action = false;
        }
        if(action) {
            System.out.printf("Wynik działania: %.2f %c %.2f = %.2f\n", a, key,b,result);
        }
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Błąd: Wprowadzono znak nie liczbę!");
        }
        System.out.println("Naciśnij Enter, aby zakończyć program.");
        sc.nextLine();
        sc.nextLine();
        sc.close();
    }
}