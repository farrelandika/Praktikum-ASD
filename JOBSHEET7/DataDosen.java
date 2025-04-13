package JOBSHEET7;

public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    public void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        }
    }

    public void tampil() {
        if (idx == 0) {
            System.out.println("Data dosen kosong.");
            return;
        }

        for (int i = 0; i < idx; i++) {
            System.out.println("Data Dosen ke-" + (i + 1) + ":");
            dataDosen[i].tampil();
            System.out.println();
        }
    }

    public void sortingASC() {
       
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        tampil();
    }

    public void sortingDSC() {
        
        for (int i = 1; i < idx; i++) {
            Dosen temp = dataDosen[i];
            int j = i - 1;

            while (j >= 0 && dataDosen[j].usia < temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j = j - 1;
            }
            dataDosen[j + 1] = temp;
        }
        tampil();
    }
    public void pencarianDataSequential(String namaCari) {
        int hasilPencarian = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(namaCari)) {
                System.out.println("Data Dosen ditemukan pada indeks ke-" + i + ":");
                dataDosen[i].tampil();
                hasilPencarian++;
            }
        }
        if (hasilPencarian == 0) {
            System.out.println("Data Dosen dengan nama '" + namaCari + "' tidak ditemukan.");
        } else if (hasilPencarian > 1) {
            System.out.println("Peringatan! Ditemukan lebih dari satu data dosen dengan nama '" + namaCari + "'.");
        }
    }

    public void pencarianDataBinary(int usiaCari) {
        sortingASC(); 

        int low = 0;
        int high = idx - 1;
        int hasilPencarian = 0;
        int[] indeksDitemukan = new int[idx];
        int jumlahDitemukan = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2; 

            if (dataDosen[mid].usia == usiaCari) {
                indeksDitemukan[jumlahDitemukan++] = mid;
                hasilPencarian++;

                
                int temp = mid - 1;
                while (temp >= 0 && dataDosen[temp].usia == usiaCari) {
                    indeksDitemukan[jumlahDitemukan++] = temp;
                    hasilPencarian++;
                    temp--;
                }
                temp = mid + 1;
                while (temp < idx && dataDosen[temp].usia == usiaCari) {
                    indeksDitemukan[jumlahDitemukan++] = temp;
                    hasilPencarian++;
                    temp++;
                }
                break; 
            } else if (dataDosen[mid].usia < usiaCari) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (hasilPencarian == 0) {
            System.out.println("Data Dosen dengan usia " + usiaCari + " tidak ditemukan.");
        } else if (hasilPencarian == 1) {
            System.out.println("Data Dosen ditemukan pada indeks ke-" + indeksDitemukan[0] + ":");
            dataDosen[indeksDitemukan[0]].tampil();
        } else if (hasilPencarian > 1) {
            System.out.println("Peringatan! Ditemukan " + hasilPencarian + " data dosen dengan usia " + usiaCari + " pada indeks:");
            for (int i = 0; i < jumlahDitemukan; i++) {
                System.out.println("- " + indeksDitemukan[i]);
                dataDosen[indeksDitemukan[i]].tampil();
                System.out.println();
            }
        }
    }
}