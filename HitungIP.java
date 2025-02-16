import java.util.Scanner;

public class HitungIP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namaMataKuliah = {
            "Pancasila", 
            "Konsep Teknologi dan Informasi", 
            "Critical Thinking and Problem Solving", 
            "Matematika Dasar", 
            "Bahasa Inggris",  
            "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", 
            "Keselamatan dan Kesehatan Kerja"
        };
        
        double[] nilaiAngka = new double[namaMataKuliah.length];
        String[] nilaiHuruf = new String[namaMataKuliah.length];
        double[] nilaiMutu = new double[namaMataKuliah.length];
        
        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            while (true) {
                System.out.print("\nMasukkan nilai untuk MK " + namaMataKuliah[i] + " : ");
                if (scanner.hasNextDouble()) {
                    nilaiAngka[i] = scanner.nextDouble();
                    if (nilaiAngka[i] >= 0 && nilaiAngka[i] <= 100) {
                        break; 
                    } else {
                        System.out.println("Nilai harus antara 0 dan 100. Silakan coba lagi.");
                    }
                } else {
                    System.out.println("Input tidak valid. Silakan masukkan angka.");
                    scanner.next(); 
                }
            }
            if (nilaiAngka[i] >= 80) {
                nilaiHuruf[i] = "A";
                nilaiMutu[i] = 4.0;
            } else if (nilaiAngka[i] >= 73) {
                nilaiHuruf[i] = "B+";
                nilaiMutu[i] = 3.5;
            } else if (nilaiAngka[i] >= 65) {
                nilaiHuruf[i] = "B";
                nilaiMutu[i] = 3.0;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                nilaiMutu[i] = 2.5;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                nilaiMutu[i] = 2.0;
            } else if (nilaiAngka[i] >= 40) {
                nilaiHuruf[i] = "D";
                nilaiMutu[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiMutu[i] = 0.0;
            }
        }
        System.out.println("===============================");
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("===============================");
        System.out.printf("%-40s %-10s %-10s %-10s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            System.out.printf("%-40s %-10.2f %-10s %-10.2f\n", namaMataKuliah[i], nilaiAngka[i], nilaiHuruf[i], nilaiMutu[i]);
        }
        double total = 0.0;
        for (double ip : nilaiMutu) {
            total += ip;
        }
        double IP = total / namaMataKuliah.length;
        System.out.printf("\nIP Anda: %.2f\n", IP);
        
    }
}
