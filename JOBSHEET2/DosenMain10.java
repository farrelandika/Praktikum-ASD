package JOBSHEET2;

public class DosenMain10 {
    public static void main(String[] args) {
        Dosen10 dosen1 = new Dosen10();
        System.out.println("Informasi Dosen 1:");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Masa kerja: " + dosen1.hitungMasaKerja(2024) + " tahun");
        dosen1.ubahKeahlian("Sistem Informasi");
        System.out.println();

        Dosen10 dosen2 = new Dosen10("D002", "Dr. Siti Rahayu", true, 2010, "Matematika");
        System.out.println("Informasi Dosen 2:");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        System.out.println("Masa kerja: " + dosen2.hitungMasaKerja(2024) + " tahun");
        dosen2.ubahKeahlian("Statistika");
    }
}