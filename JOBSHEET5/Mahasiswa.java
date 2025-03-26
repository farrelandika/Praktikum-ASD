package JOBSHEET5;

public class Mahasiswa {
    String nama;
    int uts, uas;

    Mahasiswa(String nama, int uts, int uas) {
        this.nama = nama;
        this.uts = uts;
        this.uas = uas;
    }

    int maxUTS(Mahasiswa[] mhs, int l, int r) {
        if (l == r) return mhs[l].uts;
        int mid = (l + r) / 2;
        int leftMax = maxUTS(mhs, l, mid);
        int rightMax = maxUTS(mhs, mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    int minUTS(Mahasiswa[] mhs, int l, int r) {
        if (l == r) return mhs[l].uts;
        int mid = (l + r) / 2;
        int leftMin = minUTS(mhs, l, mid);
        int rightMin = minUTS(mhs, mid + 1, r);
        return Math.min(leftMin, rightMin);
    }

    double avgUAS(Mahasiswa[] mhs) {
        double total = 0;
        for (Mahasiswa m : mhs) {
            total += m.uas;
        }
        return total / mhs.length;
    }
}
