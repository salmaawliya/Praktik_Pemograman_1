import java.util.Scanner;

public class Operator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai A: ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan nilai B: ");
        double b = scanner.nextDouble();

        // Comparison Operators
        System.out.println("A == B " + (a == b));       
        System.out.println("A != B " + (a != b));
        System.out.println("A > B " + (a > b));
        System.out.println("A < B " + (a < b));
        System.out.println("A >= B " + (a >= b));
        System.out.println("A <= B " + (a <= b));

        // Logical Operators
        System.out.println("Hasil A < 10 && B > 6 = " + (a < 10 && b > 6));     // Logical and (&&)
        System.out.println("Hasil A < 12 || B > 9 = " + (a < 12 || b > 9));     // Logical or (||)
        System.out.println("Hasil !(A < 8 && B > 5) = " + !(a < 8 && b > 5));   // Logical not (!)
    }
}