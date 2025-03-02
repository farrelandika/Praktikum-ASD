package JOBSHEET3;
import java.util.Scanner;

public class DosenDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen10[] daftarDosen = new Dosen10[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode           : ");
            String kode = sc.nextLine();

            System.out.print("Nama           : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin: ");
            String jk = sc.nextLine();
            boolean jenisKelamin = jk.equalsIgnoreCase("Pria");

            System.out.print("Usia           : ");
            int usia = Integer.parseInt(sc.nextLine());

            daftarDosen[i] = new Dosen10(kode, nama, jenisKelamin, usia);
            System.out.println("------------------------------");
        }

        DataDosen10.dataSemuaDosen(daftarDosen);
        DataDosen10.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen10.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen10.infoDosenPalingTua(daftarDosen);
        DataDosen10.infoDosenPalingMuda(daftarDosen);

        sc.close();
    }
}
