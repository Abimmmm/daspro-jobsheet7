import java.util.Scanner;

public class SiakadFor01 {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + i + ": ");
            nilai = sc01.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }else if (nilai< terendah) {
                terendah = nilai;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}