package com.pertemuan3;
class Mahasiswa {
  String npm;
  String nama;
  String jurusan;
  double ipk;

  Mahasiswa(String paramNama, String paramJurusan, String paramNpm, double paramIpk){
    nama = paramNama;
    jurusan = paramJurusan;
    npm = paramNpm;
    ipk = paramIpk;
  }

  void tampilData() {
    System.out.println("Nama     : " + nama);
    System.out.println("Jurusan  : " + jurusan);
    System.out.println("Npm      : " + npm);
    System.out.println("IPK      : " + ipk);
  }
}


