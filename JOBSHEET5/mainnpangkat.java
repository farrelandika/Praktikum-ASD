package JOBSHEET5;

import java.util.Scanner;

public class mainnpangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Elemen: ");
        int elemen = input.nextInt();

        pangkat[] png = new pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + ": ");
            int pangkat = input.nextInt();

            png[i] = new pangkat(basis, pangkat);
        }

        System.out.println("Hasil Pangkat Brute Force:");
        for (pangkat p : png) {
            System.out.println(p.nilai + "^" + p.Pangkat + " = " + p.pangkatBF(p.nilai, p.Pangkat));
        }

        System.out.println("Hasil Pangkat Divide and Conquer:");
        for (pangkat p : png) {
            System.out.println(p.nilai + "^" + p.Pangkat + " = " + p.pangkatDC(p.nilai, p.Pangkat));
        }

        input.close();
    }
}
