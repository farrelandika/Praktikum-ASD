public class RoyalGarden {
    private static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    private static int[] hargaBunga = {75000, 50000, 60000, 10000};

    private static String[] namaBunga = {"Agionema", "Keladi", "Alocasia", "Mawar"};

    public static void main(String[] args) {
        tampilkanPendapatan();
        tampilkanStockCabang4();
        kurangiStock(new int[]{1, 2, 0, 5});
        System.out.println("\nStock setelah pengurangan:");
        tampilkanStockCabang4();
    }

    public static void tampilkanPendapatan() {
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }

    public static void tampilkanStockCabang4() {
        System.out.println("\nJumlah stock setiap jenis bunga di RoyalGarden 4:");
        for (int j = 0; j < stockBunga[3].length; j++) {
            System.out.println(namaBunga[j] + ": " + stockBunga[3][j]);
        }
    }

    public static void kurangiStock(int[] pengurangan) {
        for (int j = 0; j < stockBunga[3].length; j++) {
            stockBunga[3][j] -= pengurangan[j];
            if (stockBunga[3][j] < 0) {
                stockBunga[3][j] = 0;
            }
        }
    }
}
