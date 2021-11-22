public class Mahasiswa extends Manusia{
    private String nama;
    private String nim;
    private double ipk;

    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk= ipk;
    }

    public void getData() {
        System.out.println(this.nama + " " + this.nim + " " + this.ipk + " " + this.tinggiBadan);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return this.nama;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }
    public String getNIM() {
        return this.nim;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }
    public double getIPK() {
        return this.ipk;
    }
}
