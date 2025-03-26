package JOBSHEET5;
import java.util.Scanner;
public class mainfakktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");
        int nilai = input.nextInt();

        faktorial fk = new faktorial();
        System.out.println("Nilai Faktorial =" + nilai +
        " menggunakan BF: " + fk.faktorialBF(nilai) );
        System.out.println("Nilai faktorial: " + nilai + 
        " Menggunakan DC: " + fk.faktorialDC(nilai));
        

    }
}
