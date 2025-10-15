//TUGAS PERTEMUAN 4
//menyimpan data mahasiswa pakai arraylist
// Input data mahasiswa pakai scanner
package com.pertemuan4.dataMahasiswa;

import java.util.ArrayList;
import java.util.Scanner;

public class Mahasiswa {
  public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> dataMahasiswa = new ArrayList<>();

        System.out.println("======== Program Data Mahasiswa ========");
        System.out.println("Ketik (Nama - NPM - Jurusan), kalau udh selesai ketik selesai");

        while (true) {
          System.out.print("Masukan Data: ");
          String data = scanner.nextLine();
          if (data.equalsIgnoreCase("selesai")) {
            break;
          }
          dataMahasiswa.add(data);
        }

        System.out.println("\n ======== Daftar Data mahasiswa ========");
        for (int i = 0; i < dataMahasiswa.size(); i++) {
            System.out.println((i+1) + "." + dataMahasiswa.get(i));
        }
    }
}
