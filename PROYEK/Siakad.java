import java.util.Scanner;

public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
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

        Mahasiswa inputMahasiswa = new Mahasiswa();
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa = ");
        String nim = scan.nextLine();
        inputMahasiswa.setNIM(nim);
        System.out.print("Masukkan Nama Mahasiswa = ");
        String nama = scan.nextLine();
        inputMahasiswa.setNama(nama);
        System.out.print("Masukkan IPK Mahasiswa = ");
        double ipk = scan.nextDouble();
        inputMahasiswa.setIPK(ipk);
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
                System.out.println(mahasiswa[i].getNama() + "   " + mahasiswa[i].getNIM() + "  " + mahasiswa[i].getIPK() );
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
            total += mahasiswa[i].getIPK();
        }
        double rerata = total/jumlahData; 
        System.out.println();
        System.out.println("Rerata IPK Mahasiswa = " + rerata);
    }
    
}