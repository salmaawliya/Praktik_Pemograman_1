import java.util.Scanner;

public class Tugas4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai i: ");
        double i = scanner.nextDouble();
        System.out.print("Masukkan nilai j: ");
        double j = scanner.nextDouble();

        double hasil = i + j;       //Addition
        System.out.println("Nilai i + j = " + hasil);

        hasil = i - j;      //Subtraction
        System.out.println("Nilai i - j = " + hasil);

        hasil = i * j;      //Multiplication
        System.out.println("Nilai i * j = " + hasil);

        hasil = i / j;      //Division
        System.out.println("Nilai i / j = " + hasil);

        hasil = i % j;      //Modulus
        System.out.println("Nilai i % j = " + hasil);


    }
}