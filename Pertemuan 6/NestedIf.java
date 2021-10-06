import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan umur Anda = ");
        int umur = scanner.nextInt();
        
        if(umur > 0 && umur <= 5) {
            System.out.println("Anda masih balita");
            System.out.println();
            System.out.print("Masukkan umur orang tua Anda: ");
            int umurOrangTua = scanner.nextInt();
            if(umurOrangTua < 15) {
                System.out.println("Sebaiknya meminta bantuan pengasuh anak dan orang tua");
            } else if (umurOrangTua >= 15 && umurOrangTua <= 19) {
                System.out.println("Sebaiknya meminta bantuan orang tua");
            } else {
                System.out.println("Anda bisa menngasuh anak sendiri");
            }
        } else if( umur > 5 && umur <= 19) {
            System.out.println("Anda sudah remaja");
        } else if(umur > 19 && umur <= 50) {
            System.out.println("Anda sudah dewasa");
        } else if( umur > 50) {
            System.out.println("Anda sudah tua");
        } else {
            System.out.println("Data tidak valid");
        }
        System.out.println();
        System.out.println("Done");
    }
}