import java.util.Scanner;

public class CobaInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan umur Anda: ");
        int umur = scanner.nextInt();

        System.out.println("Masukkan tinggi badan Anda: ");
        double tinggi = scanner.nextDouble();

        System.out.println("Masukkan berat badan Anda: ");
        double berat = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Masukkan alamat Anda: ");
        String alamat = scanner.nextLine();

        System.out.println("Nama Anda adalah " + nama);
        System.out.println("Umur Anda adalah " + umur + " tahun");
        System.out.println("Tinggi badan anda adalah " + tinggi + " cm");
        System.out.println("Berat badan anda adalah " + berat + " kg");
        System.out.println("Anda beralamat di " + alamat);
    }
}