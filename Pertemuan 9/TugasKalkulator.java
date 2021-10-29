import java.util.Scanner;

public class TugasKalkulator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai A = ");
        double nilaiA = scan.nextDouble();
        System.out.print("Masukan nilai B = ");
        double nilaiB = scan.nextDouble();

        double hasil1 = penjumlahan(nilaiA, nilaiB);
        System.out.println();
        System.out.println("Nilai A + B = " + hasil1);
        double hasil2 = pengurangan(nilaiA, nilaiB);
        System.out.println();
        System.out.println("Nilai A - B = " + hasil2);
        double hasil3 = perkalian(nilaiA, nilaiB);
        System.out.println();
        System.out.println("Nilai A * B = " + hasil3);
    }

    public static double penjumlahan(double nilaiA, double nilaiB) {
        double hasil1 = nilaiA + nilaiB;
        return hasil1;
    }
    public static double pengurangan(double nilaiA, double nilaiB) {
        double hasil2 = nilaiA - nilaiB;
        return hasil2;
    }
    public static double perkalian(double nilaiA, double nilaiB) {
        double hasil3 = nilaiA * nilaiB;
        return hasil3;
    }
}