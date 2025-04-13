package JOBSHEET7;

public class MahasiswaBerprestasi9 {
    Mahasiswa9[] listMhs;
    int idx;
    
    MahasiswaBerprestasi9(int jumlah) {
        listMhs = new Mahasiswa9[jumlah];
        idx = 0;
    }

    void tambah(Mahasiswa9 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil() {
        for (Mahasiswa9 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("----------------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - 1 - i; j++) {
                if (listMhs[j].ipk < listMhs[j + 1].ipk) { 
                    Mahasiswa9 tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }

    int findBinarySearch(double cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (listMhs[mid].ipk == cari) {
                return mid;
            } else if (listMhs[mid].ipk < cari) { 
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data Mahasiswa dengan IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data dengan IPK " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM    : " + listMhs[pos].nim);
            System.out.println("Nama   : " + listMhs[pos].nama);
            System.out.println("Kelas  : " + listMhs[pos].kelas);
            System.out.println("IPK    : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}
