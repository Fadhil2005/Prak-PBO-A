package com.pertemuan3;

public class App {
  public static void main(String[] args) throws Exception{
    Mahasiswa Mahasiswa1 = new Mahasiswa("fadhil", "Teknik Informatika", "4524210032", 4.0);

    Pegawai Pegawai1 = new Pegawai("budi", "42778991", "PBO");

    Mahasiswa1.tampilData();
    Pegawai1.tampilData();
    Pegawai1.istirahat();
  }
}
