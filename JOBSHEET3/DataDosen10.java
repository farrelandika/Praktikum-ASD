package JOBSHEET3;
public class DataDosen10 {
    public static void dataSemuaDosen(Dosen10[] arrayOfDosen) {
        System.out.println("===== DATA SEMUA DOSEN =====");
        for (Dosen10 dosen : arrayOfDosen) {
            dosen.cetakInfo();
        }
    }
    public static void jumlahDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen10 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }
    public static void rerataUsiaDosenPerJenisKelamin(Dosen10[] arrayOfDosen) {
        int totalPria = 0, jumlahPria = 0;
        int totalWanita = 0, jumlahWanita = 0;

        for (Dosen10 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalPria += dosen.usia;
                jumlahPria++;
            } else {
                totalWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria > 0) {
            System.out.println("Rata-rata Usia Dosen Pria   : " + (totalPria / jumlahPria));
        }
        if (jumlahWanita > 0) {
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalWanita / jumlahWanita));
        }
    }

    public static void infoDosenPalingTua(Dosen10[] arrayOfDosen) {
        Dosen10 tertua = arrayOfDosen[0];
        for (Dosen10 dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("DOSEN PALING TUA");
        tertua.cetakInfo();
    }
    public static void infoDosenPalingMuda(Dosen10[] arrayOfDosen) {
        Dosen10 termuda = arrayOfDosen[0];
        for (Dosen10 dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("DOSEN PALING MUDA");
        termuda.cetakInfo();
    }
}
