import java.util.Scanner;

public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        Siakad siakad = new Siakad();
        int menu = 0;
        while (menu != 9) {
            menu = tampilanMenu();
            if (menu == 1) {
                siakad.menambahData();
            } else if (menu == 2) {
                siakad.melihatData();
            } else if (menu == 3) {
                siakad.mencariDataByNIM();
            } else if (menu == 4) {
                siakad.menghapusData();
            } else if (menu == 5) {
                siakad.mengeditData();
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
        System.out.println("9. Keluar");
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
        System.out.print("Masukkan Berat Badan Mahasiswa (kg) = ");
        double berat = scan.nextDouble();
        System.out.print("Masukkan Semester Mahasiswa = ");
        int sem = scan.nextInt();

        Mahasiswa inputMahasiswa = new Mahasiswa(nama, nim, ipk, sem);
        inputMahasiswa.setTinggiBadan(tinggi);
        inputMahasiswa.setBeratBadan(berat);;
        mahasiswa[jumlahData] = inputMahasiswa;

        jumlahData++;
        melihatData();
    }
    

    private void melihatData() {
        if (jumlahData == 0) {
            System.out.println();
            System.out.println("Belum Ada Data");
        } else {
            System.out.println();
            System.out.println("Berikut Data Mahasiswa");
            System.out.println();
            System.out.println("Nama\t\t\tNIM\t\t\tIPK\t\tTinggi Badan\t\tBerat Badan\t\tSemester");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            for (int i = 0; i < jumlahData; i++) {
                mahasiswa[i].getData();
            }
            rerataIPK();
        }
    }

    private void mencariDataByNIM() {
        System.out.println("Disini untuk Mencari Data");
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa yang Dicari = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index == -1) {
            System.out.println();
            System.out.println("Data yang Anda Cari Tidak Tersedia");
        } else {
            System.out.println();
            System.out.println("Berikut Data yang Anda Cari");
            System.out.println("Nama\t\t\tNIM\t\t\tIPK\t\tTinggi Badan\t\tBerat Badan\t\tSemester");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            mahasiswa[index].getData();
        }
    }

    public int getIndexByNIM(String nim) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNIM().equals(nim)) {
                return i;
            }
        }
        return -1;
    }

    private void menghapusData() {
        System.out.println("Disini untuk Menghapus Data");

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa dari Data yang Akan Dihapus = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println();
            System.out.println("Data yang Anda Akan Hapus Tidak Tersedia");
        } else {
            for (int i = index; i < jumlahData; i++) {
                mahasiswa[i] = mahasiswa[i+1];
            }
            jumlahData--;
            melihatData();
        }
    }

    private void mengeditData() {
        System.out.println("Disini untuk Mengedit Data");

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa yang Akan Diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index == -1) {
            System.out.println();
            System.out.println("Data yang Anda Akan Edit Tidak Tersedia");
        } else {
            System.out.println();
            System.out.println("Berikut Data Mahasiswa");
            System.out.println("Nama\t\t\tNIM\t\t\tIPK\t\tTinggi Badan\t\tBerat Badan\t\tSemester");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            mahasiswa[index].getData();
            System.out.println();
            System.out.print("Masukan Nama Mahasiswa yang Baru = ");
            String nama = scan.nextLine();
            mahasiswa[index].setNama(nama);
            System.out.print("Masukkan NIM Mahasiswa yang Baru = ");
            nim = scan.nextLine();
            mahasiswa[index].setNIM(nim);
            System.out.print("Masukkan IPK Mahasiswa yang Baru = ");
            double ipk = scan.nextDouble();
            mahasiswa[index].setIPK(ipk);
            System.out.print("Masukkan Tinggi Badan Mahasiswa (cm) yang Baru = ");
            double tinggi = scan.nextDouble();
            mahasiswa[index].setTinggiBadan(tinggi);
            System.out.print("Masukkan Berat Badan Mahasiswa (kg) yang Baru = ");
            double berat = scan.nextDouble();
            mahasiswa[index].setBeratBadan(berat);
            System.out.print("Masukkan Semester Mahasiswa yang Baru = ");
            int sem = scan.nextInt();
            mahasiswa[index].setSem(sem);
            System.out.println();
            System.out.println("Berikut Data Mahasiswa yang Baru");
            System.out.println("Nama\t\t\tNIM\t\t\tIPK\t\tTinggi Badan\t\tBerat Badan\t\tSemester");
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            mahasiswa[index].getData();
        }
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