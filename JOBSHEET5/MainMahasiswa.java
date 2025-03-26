package JOBSHEET5;

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] mhs = {
            new Mahasiswa("Ahmad", 78, 82),
            new Mahasiswa("Budi", 85, 88),
            new Mahasiswa("Cindy", 90, 87),
            new Mahasiswa("Dian", 76, 79),
            new Mahasiswa("Eko", 92, 95),
            new Mahasiswa("Fajar", 88, 85),
            new Mahasiswa("Gina", 80, 83),
            new Mahasiswa("Hadi", 82, 84)
        };

        Mahasiswa mh = new Mahasiswa("Dummy", 0, 0);

        System.out.println("Nilai UTS tertinggi menggunakan Divide and Conquer: " + mh.maxUTS(mhs, 0, mhs.length - 1));
        System.out.println("Nilai UTS terendah menggunakan Divide and Conquer: " + mh.minUTS(mhs, 0, mhs.length - 1));
        System.out.println("Rata-rata nilai UAS dari semua mahasiswa menggunakan Brute Force: " + mh.avgUAS(mhs));
    }
}
