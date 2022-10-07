import java.util.Scanner;

class pemesanan {
    String namaPemesan;
    String alamatPemesan;
    String noTelpPemesan;
    String emailPemesan;
    String keterangan;
    String jasaTerpilih;
    String teamTerpilih;

    int jenisJasa;
    int teamPenyediaJasa;

    float biayaPenyediaJasa;
    float biayaJasaAlat;
    float biayaBahanJasa;
    float biayaTransportasi;

    String jasaPilihan (int val) {
        if (val == 1) {
            return jasaTerpilih = "Cuci Mobil";
        } else if (val == 2) {
            return jasaTerpilih = "Salon Mobil Interior";
        } else if (val == 3) {
            return jasaTerpilih = "Salon Mobil Eksterior";
        } else {
            return jasaTerpilih = "-";
        }
    }

    String teamPilihan (int val) {
        if (val == 1) {
            return teamTerpilih = "Team Sea";
        } else if (val == 2) {
            return teamTerpilih = "Team Mountain";
        } else if (val == 3) {
            return teamTerpilih = "Team Forest";
        } else {
            return teamTerpilih = "-";
        }
    }

    void dataPemesan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama: ");
        namaPemesan = sc.nextLine(); 
        System.out.print("Alamat: ");
        alamatPemesan = sc.nextLine();
        System.out.print("No. Telepon: ");
        noTelpPemesan = sc.nextLine();
        System.out.print("Email: ");
        emailPemesan = sc.nextLine();
        System.out.print("Berikan Keterangan Pemesanan: ");
        keterangan = sc.nextLine();

        System.out.println("");

        System.out.println("* Jenis Jasa *");
        System.out.println("1. Cuci Mobil");
        System.out.println("2. Salon Mobil Interior");
        System.out.println("3. Salon Mobil Eksterior");

        System.out.println("");

        System.out.print("Pilih Jenis Jasa: ");
        jenisJasa = sc.nextInt();
        this.jasaPilihan(jenisJasa);

        System.out.println("");

        System.out.println("* Team Penyedia Jasa *");
        System.out.println("1. Team Sea (2 orang)");
        System.out.println("2. Team Mountain (4 orang)");
        System.out.println("3. Team Forest (5 orang)");

        System.out.println("");

        System.out.print("Pilih Team: ");
        teamPenyediaJasa = sc.nextInt();
        this.teamPilihan(teamPenyediaJasa);

        System.out.println("");

        System.out.print("Masukkan Biaya Penyedia Jasa:         Rp.");
        biayaPenyediaJasa = sc.nextInt();
        System.out.print("Masukkan Biaya Jasa Alat:             Rp.");
        biayaJasaAlat = sc.nextInt();
        System.out.print("Masukkan Biaya Bahan Jasa:            Rp.");
        biayaBahanJasa = sc.nextInt();
        System.out.print("Masukkan Biaya Transportasi:          Rp.");
        biayaTransportasi = sc.nextInt();

    }
}

class transaksi {

   float totalBiaya (float penyediaJasa, float jasaAlat, float bahanJasa, float transport) {
    return penyediaJasa + jasaAlat + bahanJasa + transport;
   }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("***** Car Cleaning *** Anda Pesan Kami Datang *****");
        System.out.println("*********************************************************");
        System.out.println("**********************oOo********************************");
        pemesanan item = new pemesanan();
        item.dataPemesan();
        System.out.println("**********************oOo********************************");
        System.out.println("************************************************************");
        System.out.println("Jasa yang Dipesan:          :" + item.jasaTerpilih);
        System.out.println("Nama Penyedia Jasa:         :" + item.teamTerpilih);
        System.out.println("Keterangan:                 :" + item.keterangan);
        transaksi trx = new transaksi();
        System.out.println("");
        System.out.println("Total Biaya:                :Rp." + trx.totalBiaya(item.biayaPenyediaJasa, item.biayaJasaAlat, item.biayaBahanJasa, item.biayaTransportasi));
        System.out.println("");
        System.out.println("Salam Bersih Sarirotul Chamdiyah Terimakasih");
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
}
