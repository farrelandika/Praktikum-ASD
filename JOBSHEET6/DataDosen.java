package JOBSHEET6;
public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    public void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen penuh!");
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
        // Bubble Sort
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    // Tukar data
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        tampil(); 
    }

    public void sortingDSC() {
        // Insertion Sort
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
}