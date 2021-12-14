public class Mahasiswa extends Manusia{
    private String nama;
    private String nim;
    private double ipk;
    private int sem;

    public Mahasiswa(String nama, String nim, double ipk, int sem) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.sem = sem;
    }

    public void getData() {
        System.out.println(this.nama + "\t\t\t" + this.nim + "\t\t\t" + this.ipk + "\t\t" + this.tinggiBadan + "\t\t\t" + this.beratBadan + "\t\t\t" + this.sem);
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

    public void setSem(int sem) {
        this.sem = sem;
    }
    public int getSem() {
        return this.sem;
    }
}
