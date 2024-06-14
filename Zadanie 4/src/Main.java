import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.print("Podaj dochód: ");
        double inc = sc.nextDouble();
        sc.close();
        double tax;
        if(inc <= 85528){
            tax = (inc * 0.18)- 566.02;
        }
        else{
            tax = 14839.02 + ((inc-85528)*0.32);
        }
        System.out.printf("Podatek wynosi: %.2f zł", tax);
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Podana wartość nie jest prawidłowa!!");
        }
    }
}