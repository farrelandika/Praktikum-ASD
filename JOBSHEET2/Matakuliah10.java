package JOBSHEET2;

public class Matakuliah10 {
    private String kodeMK;
    private String nama;
    private int sks;
    private int jumlahJam;

    public Matakuliah10() {
        this.kodeMK = "MK001";
        this.nama = "Pengantar Pemrograman";
        this.sks = 3;
        this.jumlahJam = 14;
    }

    public Matakuliah10(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi: " + sks);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambahkan menjadi: " + jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi menjadi: " + jumlahJam);
        } else {
            System.out.println("Pengurangan jam tidak dapat dilakukan, jumlah jam tidak mencukupi.");
        }
    }
}