package JOBSHEET2;

public class MahasiswaMain10 {
    public static void main(String[] args) {
        
        mahasiswa10 mhsl = new mahasiswa10();
        mhsl.nama = "Muhammad Ali Farhan";
        mhsl.nim = "2441720171";
        mhsl.kelas = "SI 2J";
        mhsl.ipk = 3.55;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("SJ 2K");
        mhsl.updateIpk(3.60);
        mhsl.tampilkanInformasi();

        mahasiswa10 mhs2 = new mahasiswa10("Anissa Nabilla","2141720160",3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        mahasiswa10 mhs = new mahasiswa10("Budi reinhard","2342523",3.70,"TI 1B");
        mhs.updateIpk(3.70);
        mhs.tampilkanInformasi();

    }
    
}
