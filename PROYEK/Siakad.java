import java.util.Scanner;

public class Siakad {

    public static void main(String[] args) {
        int menu = 0;
        while (menu != 5) {
            menu = tampilanMenu();
            if (menu == 1) {
                menambahData();
            } else if (menu == 2) {
                melihatData();
            } else if (menu == 3) {
                menghapusData();
            } else if (menu == 4) {
                mengeditData();
            }
        }
    }

    public static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("-----Menu-----");
        System.out.print("Pilih menu = ");
        int menu = scan.nextInt();
        return menu;
    }

    public static void menambahData() {
        System.out.println("Disini untuk Menambah Data");
    }

    public static void melihatData() {
        System.out.println("Disini untuk Melihat Data");
    }

    public static void menghapusData() {
        System.out.println("Disini untuk Menghapus Data");
    }

    public static void mengeditData() {
        System.out.println("Disini untuk Mengedit Data");
    }
    
}