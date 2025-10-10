package com.pertemuan3;
public class Pegawai {
  public String nama;
  private String npwp;
  protected String mataKuliah;

  Pegawai(String paramNama, String paramNpwp, String paramMataKuliah){
    nama = paramNama;
    npwp = paramNpwp;
    mataKuliah = paramMataKuliah;
  }

  public void tampilData(){
    System.out.println("Nama        : " + nama);
    System.out.println("Npwp        : " + npwp);
    System.out.println("MataKuliah  : " + mataKuliah);
  }

  private void mengajar(){
    System.out.println("Dosen " + nama + " sedang mengajar " + mataKuliah);
  }

  protected void istirahat(){
    System.out.println("Dosen " + nama + " sedang istirahat");
  }
}
