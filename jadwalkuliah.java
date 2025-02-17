import java.util.Scanner;

public class jadwalkuliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();
        input.nextLine(); 
        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = input.nextLine();
            System.out.print("SKS: ");
            sks[i] = input.nextInt();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine();  
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = input.nextLine();
        }

        //Menu utama
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMataKuliah, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari yang ingin ditampilkan: ");
                    String hari = input.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMataKuliah, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem = input.nextInt();
                    input.nextLine();  
                    tampilkanJadwalBerdasarkanSemester(namaMataKuliah, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String namaCari = input.nextLine();
                    cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah, namaCari);
                    break;
                case 5:
                    System.out.println("Program Keluar.");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
    public static void tampilkanSeluruhJadwal(String[] nama, int[] sks, int[] semester, String[] hari) {
        System.out.println("\nSeluruh Jadwal Kuliah:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama: " + nama[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
        }
    }
    public static void tampilkanJadwalBerdasarkanHari(String[] nama, int[] sks, int[] semester, String[] hari, String hariCari) {
        System.out.println("\nJadwal Kuliah pada Hari " + hariCari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (hari[i].equalsIgnoreCase(hariCari)) {
                System.out.println("Nama: " + nama[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hariCari + ".");
        }
    }
    public static void tampilkanJadwalBerdasarkanSemester(String[] nama, int[] sks, int[] semester, String[] hari, int semCari) {
        System.out.println("\nJadwal Kuliah pada Semester " + semCari + ":");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (semester[i] == semCari) {
                System.out.println("Nama: " + nama[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada semester " + semCari + ".");
        }
    }

    public static void cariMataKuliah(String[] nama, int[] sks, int[] semester, String[] hari, String namaCari) {
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(namaCari)) {
                System.out.println("\nInformasi Mata Kuliah:");
                System.out.println("Nama: " + nama[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah dengan nama " + namaCari + " tidak ditemukan.");
        }
    }
}
