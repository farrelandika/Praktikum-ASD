package JOBSHEET7;

import java.util.Scanner;

public class MahasiswaDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi9 list = new MahasiswaBerprestasi9(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            String nim = sc.nextLine();
            System.out.print("Nama   : ");
            String nama = sc.nextLine();
            System.out.print("Kelas  : ");
            String kelas = sc.nextLine();
            System.out.print("IPK    : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            System.out.println("---------------------------");
            list.tambah(new Mahasiswa9(nim, nama, kelas, ipk));
        }

        list.tampil();
        list.bubbleSort();

        System.out.println("===============================");
        System.out.println("Pencarian data");
        System.out.println("===============================");
        System.out.print("Masukkan IPK mahasiswa yang dicari: ");
        double cari = sc.nextDouble();

        int posisi = list.findBinarySearch(cari, 0, jumMhs - 1);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}
