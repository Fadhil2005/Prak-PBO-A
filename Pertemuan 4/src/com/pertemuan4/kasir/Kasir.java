package com.pertemuan4.kasir;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KASIR ===");

        System.out.print("Masukan nama pembeli: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukan nama produk: ");
        String produk = scanner.nextLine();
        
        System.out.print("Masukan harga: ");
        float harga = scanner.nextFloat();
        
        System.out.print("Masukan jumlah: ");
        int jumlah = scanner.nextInt();

        float total = harga * jumlah;
        
        System.out.println("Nama: " + nama);
        System.out.println("produk: " + produk);
        System.out.println("harga: " + harga);
        System.out.println("jumlah: " + jumlah);
        System.out.println("TOTAL: " + total);
    }
}
