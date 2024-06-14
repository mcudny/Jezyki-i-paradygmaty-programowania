import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
        System.out.print("Podaj wagę w kg: ");
        double weight = sc.nextDouble();

        System.out.print("Podaj wzrost w metrach: ");
        double height = sc.nextDouble();
        sc.close();
        double bmi = weight / (height * height);
        System.out.printf("Twoje BMI wynosi: %.2f \n", bmi);

        if (bmi < 18.5) {
            System.out.println("niedowaga");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("waga prawidłowa");
        }
        else{
            System.out.println("nadwaga");
        }
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Podana wartość nie jest prawidłowa!!");
        }
    }
}