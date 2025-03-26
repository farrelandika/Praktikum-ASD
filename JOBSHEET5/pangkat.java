package JOBSHEET5;

public class pangkat {
    int nilai, Pangkat;

    public pangkat(int n, int p) {
        nilai = n;
        Pangkat = p;
    }

    public int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < Pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    public int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = pangkatDC(a, n / 2);
        if (n % 2 == 0) {
            return halfPower * halfPower;
        } else {
            return halfPower * halfPower * a;
        }
    }
}
