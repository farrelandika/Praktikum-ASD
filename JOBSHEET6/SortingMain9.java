package JOBSHEET6;

public class SortingMain9 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting9 dataurut1 = new Sorting9(a, a.length);

        System.out.println("Data Awal:");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data setelah diurutkan dengan Bubble Sort (ASC):");
        dataurut1.tampil();

        int b[] = {30,20,2,8,14};
        Sorting9 dataurut2 = new Sorting9(b, b.length);

        System.out.println("Data Awal 2:");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data setelah diurutkan dengan Selection Sort (ASC):");
        dataurut2.tampil();

        int c[]= {40,10,4,9,3};
        Sorting9 dataurut3 = new Sorting9(c, c.length);
        System.out.println("Data Awal 3:");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data setelah diurutkan dengan Insertion Sort (ASC):");
        dataurut3.tampil();


    }
}
