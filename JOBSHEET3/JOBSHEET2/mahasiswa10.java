package JOBSHEET2;

public class mahasiswa10 {
        String nama;
        String nim;
        String kelas;
        double ipk;

        void tampilkanInformasi () {
            System.out.println("Nama: "+ nama);
            System.out.println("NIM: " +nim);
            System.out.println("IPK: " + ipk);
            System.out.println("Kelas: " + kelas);

        }

        void ubahKelas(String kelasBaru){
            kelas = kelasBaru;

        }
        void updateIpk(double ipkBaru) {
            if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
                ipk = ipkBaru;
            }else {
                System.out.println("IPK tidak valid,harus diantara 0.0 dan 4.0");
            }
        }
        String nilaiKinerja () {
            if (ipk >= 3.5) {
                return "kinerja sangat baik";
            } else if (ipk >= 3.0) {
                return "Kinerja baik";
            }else if (ipk >= 2.0) {
                return "Kinerja Cukup";
            }else {
                return "Kinerja kurang";
            }
        }
        public mahasiswa10() {
        }
        public mahasiswa10(String nm, String nim, double ipk, String kls) {
            this.nama = nm;
            this.nim = nim;
            this.ipk = ipk;
            this.kelas = kls;
        }
        
    }

