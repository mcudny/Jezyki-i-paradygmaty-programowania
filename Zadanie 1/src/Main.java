import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę w st. C: ");
        try {
            double tempC = scanner.nextDouble();
            scanner.close();
            double tempF = tempC * 1.8 + 32.0;
            System.out.println("Temperatura w stopniach Celcjusza: " + tempC);
            System.out.println("Temperatura w stopniach Fahrenheita" + tempF);
        }
        catch (java.util.InputMismatchException e){
            System.out.println("Podaj cyfry nie znaki");
            }
            }
    }
