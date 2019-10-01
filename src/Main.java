import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        double a;
        double b;
        double pole;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Podaj długość boku a: ");
        a = scanner.nextDouble();
        System.out.println("Podaj długość boku b: ");
        b = scanner.nextDouble();

        pole = a * b;

        System.out.println("Pole prostokąta wynosi: " + pole);
    }
}
