package JOBSHEET2;

public class MataKuliahMain10 {
    public static void main(String[] args) {
        Matakuliah10 mk1 = new Matakuliah10();
        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        System.out.println();

        Matakuliah10 mk2 = new Matakuliah10("MK002", "Struktur Data", 4, 16);
        System.out.println("Informasi Mata Kuliah 2:");
        mk2.tampilInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(17);
    }
}