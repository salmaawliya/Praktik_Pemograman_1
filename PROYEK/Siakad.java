import java.util.Scanner;

public class Siakad {
    private String[] nama = new String[1000];
    private double[] ipk = new double[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        Siakad siakad = new Siakad();
        int menu = 0;
        while (menu != 5) {
            menu = tampilanMenu();
            if (menu == 1) {
                siakad.menambahData();
            } else if (menu == 2) {
                siakad.melihatData();
            } else if (menu == 3) {
                menghapusData();
            } else if (menu == 4) {
                mengeditData();
            }
        }
    }

    private static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("-----Menu-----");
        System.out.println("1. Tambah Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Edit Data");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu = ");
        int menu = scan.nextInt();
        System.out.println();
        return menu;
    }

    private void menambahData() {
        System.out.println("Disini untuk Menambah Data");

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa = ");
        nama[jumlahData] = scan.nextLine();
        System.out.print("Masukkan IPK Mahasiswa = ");
        ipk[jumlahData] = scan.nextDouble();
        jumlahData++;
        melihatData();
    }

    private void melihatData() {
        if (jumlahData == 0) {
            System.out.println("Belum Ada Data");
        } else {
            System.out.println();
            System.out.println("Berikut Data Mahasiswa");
            for (int i = 0; i < jumlahData; i++) {
                System.out.println(nama[i] + "   " + ipk[i]);
            }
            rerataIPK();
        }
    }

    public static void menghapusData() {
        System.out.println("Disini untuk Menghapus Data");
    }

    public static void mengeditData() {
        System.out.println("Disini untuk Mengedit Data");
    }

    public void rerataIPK() {
        double total = 0;
        for (int i = 0; i < jumlahData; i++) {
            total += ipk[i];
        }
        double rerata = total/jumlahData; 
        System.out.println();
        System.out.println("Rerata IPK Mahasiswa = " + rerata);
    }
    
}