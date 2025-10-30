import java.util.Scanner;
public class KafeDoWhile07 {
    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);

    int kopi, teh, roti;
    String namaPelanggan;
    
    double hargaKopi = 12000;
    double hargaTeh = 7000;
    double hargaRoti = 20000;

    do {
        
        System.out.print("Masukkan Nama Pelanggan (ketik 'batal' untuk keluar): ");
        namaPelanggan = sc.nextLine();

        if (namaPelanggan.equalsIgnoreCase("batal")) {
            System.out.println("Transaksi Dibatalkan");
            break;
        }
        System.out.print("Jumlah Kopi: ");
        kopi = sc.nextInt();
        System.out.print("Jumlah Teh: ");
        teh = sc.nextInt();
        System.out.print("Jumlah Roti: ");
        roti = sc.nextInt();
        
        double totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
        System.out.println("Total Yang Harus Dibayar: Rp " + totalHarga);
        sc.nextLine();
    }while(true);
    System.out.println("Semua Transaksi Selesai.");
    sc.close();
    }

}
