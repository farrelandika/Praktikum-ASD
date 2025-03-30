package JOBSHEET6;

public class MahasiswaDemo9 {
    public static void main(String[] args) {
        MahasiswaBerprestasi9 list = new MahasiswaBerprestasi9();
        Mahasiswa9 m1 = new Mahasiswa9("111", "Ayu", "2C", 3.7);
        Mahasiswa9 m2 = new Mahasiswa9("222", "Dika", "2C", 3.0);
        Mahasiswa9 m3 = new Mahasiswa9("333", "Ila", "2C", 3.8);
        Mahasiswa9 m4 = new Mahasiswa9("444", "Susi", "2C", 3.1);
        Mahasiswa9 m5 = new Mahasiswa9("555", "Yayuk", "2C", 3.4);


        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting:");
        list.tampil();
        
        System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC):");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Yang Sudah Terurut Menggunakan Selection Sort (ASC):");
        list.selectionSort();
        list.tampil();

        System.out.println("Data Yang Sudah Terurut Menggunakan Insertion Sort (ASC):");
        list.insetionSort();
        list.tampil();

    }
}
