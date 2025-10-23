package com.inheritance;

public class Karyawan {
  protected String kodeKaryawan;
  protected String nama;

  public Karyawan(String kodekaryawan, String nama) {
    this.kodeKaryawan = kodekaryawan;
    this.nama = nama;
  }
  public void absenPagi(){
    System.out.println(this.nama + " : absen pagi");
  }
  public void kerja(){
    System.out.println(this.nama + " : sedang bekerja");
  }
  public void absenPulang(){
    System.out.println(this.nama + " : absen pulang");
  }
  public void getInfo(){
    System.out.println("Nama karyawan: " + this.nama);
    System.out.println("Kode karyawan: " + this.kodeKaryawan);
  }
}
