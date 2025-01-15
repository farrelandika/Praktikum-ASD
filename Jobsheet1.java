import java.util.Scanner;

public class Jobsheet1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==================");
        System.out.print("Masukkan nilai tugas: ");
        double tugas = scanner.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = scanner.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = scanner.nextDouble();
        System.out.println("==================");
        System.out.println("==================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("==================");
            System.out.println("==================");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            String[] hasilKonversi = konversiNilai(nilaiAkhir);
            String nilaiHuruf = hasilKonversi[0];
            String keterangan;

            // Menggunakan || untuk mengecek nilai huruf yang LULUS
            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
                keterangan = "SELAMAT ANDA LULUS";
            } 
            // Memisahkan else untuk nilai huruf D dan E
            else if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                keterangan = "ANDA TIDAK LULUS";
            } 
            else {
                keterangan = "Keterangan tidak valid";
            }

            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("==================");
            System.out.println("==================");
            System.out.println(keterangan);
        }
    }

    public static String[] konversiNilai(double nilaiAkhir) {
        if (nilaiAkhir >= 80) {
            return new String[]{"A", "4"};
        } else if (nilaiAkhir >= 73) {
            return new String[]{"B+", "3.5"};
        } else if (nilaiAkhir >= 65) {
            return new String[]{"B", "3"};
        } else if (nilaiAkhir >= 60) {
            return new String[]{"C+", "2.5"};
        } else if (nilaiAkhir >= 50) {
            return new String[]{"C", "2"};
        } else if (nilaiAkhir >= 39) {
            return new String[]{"D", "1"};
        } else {
            return new String[]{"E", "0"};
        }
    }
}