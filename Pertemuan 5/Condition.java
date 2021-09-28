import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // if
        System.out.print("Masukkan bilangan bulat = ");
        int x = scanner.nextInt();
        int sisa = x % 2;

        if(sisa == 0) {
            System.out.println("Anda memasukkan bilangan genap");
        } else {
            System.out.println("Anda memasukkan bilangan ganjil");
        }
        System.out.println("Done");

        // else if
        System.out.print("Masukkan umur Anda = ");
        int umur = scanner.nextInt();
        
        if(umur > 0 && umur <= 5) {
            System.out.println("Anda masih balita");
        } else if( umur > 5 && umur <= 19) {
            System.out.println("Anda sudah remaja");
        } else if(umur > 19 && umur <= 50) {
            System.out.println("Anda sudah dewasa");
        } else if( umur > 50) {
            System.out.println("Anda sudah tua");
        } else {
            System.out.println("Data tidak valid");
        }
        System.out.println("Done");
    }
}