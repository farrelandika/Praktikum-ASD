public class plat {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {
            {"BANTEN"},
            {"JAKARTA"},
            {"BANDUNG"},
            {"CIREBON"},
            {"BOGOR"},
            {"PEKALONGAN"},
            {"SEMARANG"},
            {"SURABAYA"},
            {"MALANG"},
            {"TEGAL"}
        };
        for (int i = 0; i < KODE.length; i++) {
            System.out.print(KODE[i] + "  ");
            for (int j = 0; j < KOTA[i][0].length(); j++) {
                System.out.print(KOTA[i][0].charAt(j) + "  ");
            }
            System.out.println();
        }
    }
}
