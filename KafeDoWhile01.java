import java.util.Scanner;

public class KafeDoWhile01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargaTeh = 7000, hargaKopi = 12000, hargaRoti = 20000;

        do {
            System.out.print("Masukan nama pelangan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc01.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc01.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc01.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc01.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc01.nextLine();

        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}
