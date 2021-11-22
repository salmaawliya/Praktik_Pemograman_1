import java.util.Scanner;

public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        Siakad siakad = new Siakad();
        int menu = 0;
        while (menu != 6) {
            menu = tampilanMenu();
            if (menu == 1) {
                siakad.menambahData();
            } else if (menu == 2) {
                siakad.melihatData();
            } else if (menu == 3) {
                siakad.mencariData();
            } else if (menu == 4) {
                menghapusData();
            } else if (menu == 5) {
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
        System.out.println("3. Cari Data");
        System.out.println("4. Hapus Data");
        System.out.println("5. Edit Data");
        System.out.println("6. Keluar");
        System.out.print("Pilih menu = ");
        int menu = scan.nextInt();
        System.out.println();
        return menu;
    }

    private void menambahData() {
        System.out.println("Disini untuk Menambah Data");

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa = ");
        String nama = scan.nextLine();
        System.out.print("Masukkan NIM Mahasiswa = ");
        String nim = scan.nextLine();
        System.out.print("Masukkan IPK Mahasiswa = ");
        double ipk = scan.nextDouble();
        System.out.print("Masukkan Tinggi Badan Mahasiswa (cm) = ");
        double tinggi = scan.nextDouble();

        Mahasiswa inputMahasiswa = new Mahasiswa(nama, nim, ipk);
        inputMahasiswa.setTinggiBadan(tinggi);
        mahasiswa[jumlahData] = inputMahasiswa;

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
                mahasiswa[i].getData();
            }
            rerataIPK();
        }
    }

    private void mencariData() {
        System.out.println("Disini untuk Mencari Data");
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa yang Dicari = ");
        String nim = scan.nextLine();
        for (int i = 0; i < jumlahData; i++) {
            if (nim.equals (mahasiswa[i].getNIM())) {
                System.out.println();
                System.out.println("Berikut Data yang Anda Cari");
                mahasiswa[i].getData();
                break;
            } else {
                System.out.println();
                System.out.println("Data yang Anda Cari Tidak Ada");
            }
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
            total += mahasiswa[i].getIPK();
        }
        double rerata = total/jumlahData; 
        System.out.println();
        System.out.println("Rerata IPK Mahasiswa = " + rerata);
    }
    
}