package MODUL1_KEZIA.TPMODUL1_KEZIA;

import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Menambahkan data penerbangan ke dalam daftar
        daftarPenerbangan.add(new Penerbangan("GA001", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new Penerbangan("GA002", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1300000));

        int pilihanMenu;
        Penumpang penumpang = null;
        Penerbangan penerbanganDipilih = null;

        do {
            System.out.println("====== EAD Ticket Booking System ======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Silahkan pilih menu: ");
            pilihanMenu = scanner.nextInt();

            switch (pilihanMenu) {
                case 1:
                    // Menampilkan daftar penerbangan
                    System.out.println("\nDaftar Penerbangan:");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarPenerbangan.get(i).getNomorPenerbangan() + 
                                           " ---> " + daftarPenerbangan.get(i).getBandaraKeberangkatan() + 
                                           " menuju " + daftarPenerbangan.get(i).getBandaraTujuan());
                    }
                    System.out.println();
                    break;

                case 2:
                    // Memasukkan data penumpang dan memilih penerbangan
                    if (penumpang == null) {
                        System.out.println("Silakan isi data diri anda terlebih dahulu!");
                        String NIK = "102022330280"; // NIK Diandra Kezia
                        String namaDepan = "Diandra"; // Nama Depan
                        String namaBelakang = "Kezia"; // Nama Belakang

                        penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

                        System.out.println("\nSilakan Pilih Tiket Penerbangan Yang Tersedia");
                        for (int i = 0; i < daftarPenerbangan.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarPenerbangan.get(i).getNomorPenerbangan() + 
                                               " ---> " + daftarPenerbangan.get(i).getBandaraKeberangkatan() + 
                                               " menuju " + daftarPenerbangan.get(i).getBandaraTujuan());
                        }
                        System.out.print("Masukkan nomor penerbangan: ");
                        int pilihanPenerbangan = scanner.nextInt();
                        penerbanganDipilih = daftarPenerbangan.get(pilihanPenerbangan - 1);

                        System.out.println("Pembelian Tiket Berhasil Dilakukan. Cek Pesanan Tiket pada Menu (3).\n");
                    } else {
                        System.out.println("Anda sudah membeli tiket!\n");
                    }
                    break;

                case 3:
                    // Menampilkan pesanan tiket
                    if (penumpang == null || penerbanganDipilih == null) {
                        System.out.println("Pembelian Tiket Tidak Ada\n");
                    } else {
                        System.out.println("\n====== Detail Tiket Penerbangan ======");
                        penumpang.tampilDaftarPenumpang();
                        penerbanganDipilih.tampilDaftarPenerbangan();
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!\n");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih kembali.\n");
                    break;
            }

        } while (pilihanMenu != 4);

        scanner.close();
    }
}
