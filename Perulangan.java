import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = scanner.nextLine();
        System.out.println("==================");
        
        String kata = nim.substring(nim.length() - 2);
        
        int n = kata.charAt(0) - '0';
        n = n * 10 + (kata.charAt(1) - '0');
        
        if (n < 10) {
            n += 10;
        }

        System.out.println("n = " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }

            if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
