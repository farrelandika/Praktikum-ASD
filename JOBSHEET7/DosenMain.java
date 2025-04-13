package JOBSHEET7;

import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataDosen data = new DataDosen();
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC Mengurutkan Dosen Termuda Hingga Tertua");
            System.out.println("4. Sorting DSC Mengurutkan Dosen Tertua Hingga Termuda");
            System.out.println("5. Pencarian Data (Sequential - Nama)");
            System.out.println("6. Pencarian Data (Binary - Usia)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    boolean jk = input.nextLine().equalsIgnoreCase("L");
                    System.out.print("Usia: ");
                    int usia = input.nextInt();
                    input.nextLine(); 

                    Dosen dsn = new Dosen(kode, nama, jk, usia);
                    data.tambah(dsn);
                    System.out.println("Data dosen berhasil ditambahkan.");
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    break;
                case 4:
                    data.sortingDSC();
                    break;
                case 5:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String namaCariSequential = input.nextLine();
                    data.pencarianDataSequential(namaCariSequential);
                    break;
                case 6:
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int usiaCariBinary = input.nextInt();
                    input.nextLine(); 
                    data.pencarianDataBinary(usiaCariBinary);
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        input.close();
    }
}