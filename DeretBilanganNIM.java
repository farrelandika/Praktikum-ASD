import java.util.Scanner;

public class DeretBilanganNIM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = scanner.nextLine();

        // Ambil 2 digit terakhir NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        // Tampilkan nilai n
        System.out.println("n=" + n);

        // Cetak deret bilangan
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print("*");
            } else {
                System.out.print(i);
            }
            if (i < n) {
                System.out.print("");
            }
        }

        scanner.close();
    }
}