import java.util.Scanner;

public class TugasSementara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PROGRAM SIAKAD");
        System.out.println("1. Tambah Data");
        System.out.println("2. Edit Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Lihat Data");
        System.out.println("5. Keluar");
        System.out.print("Menu yang Anda pilih: ");
        int menu = scanner.nextInt();

        if(menu == 1) {
            System.out.println();
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tambah Data Mata kuliah");
            System.out.println("3. Kembali"); 
            System.out.print("Menu yang Anda pilih: ");
            int menu1 = scanner.nextInt();
            scanner.nextLine();
            if(menu1 == 1) {
                System.out.println();
                System.out.print("Masukan Nama Mahasiswa= ");
                String nama = scanner.nextLine();
                System.out.print("Mahasiswa yang Anda Tambah adalah " + nama);
            } else if(menu1 == 2) {
                System.out.println();
                System.out.print("Masukan Nama Mata Kuliah= ");
                String matKul = scanner.nextLine();
                System.out.println("Mata Kuliah yang Anda Tambah adalah " + matKul);
            } else if(menu1 == 3) {
                System.out.println();
                System.out.println("Terima kasih");
            } else {
                System.out.println();
                System.out.println("Menu Tidak Ada");
            }
        } else if(menu >= 2 && menu <= 5) {
            System.out.println();
            System.out.println("Fitur Belum Ada");
        } else {
            System.out.println();
            System.out.println("Menu Tidak Ada");
        }
    }
}