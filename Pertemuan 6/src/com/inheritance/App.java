package com.inheritance;
public class App {
    public static void main(String[] args) throws Exception {
        Karyawan ridho = new Karyawan("12345", "Ridho");
        Karyawan melan = new Karyawan("12346", "Melan");
        ridho.getInfo();
        melan.getInfo();
        System.out.println("\n");
        ridho.absenPagi();
        ridho.kerja();
        System.out.println("\n");
        melan.absenPagi();
        melan.kerja();
        System.out.println("\n");
        ridho.absenPulang();
        melan.absenPulang();

        System.out.println("\n");

        Dosen andiani = new Dosen("23455", "332211", "Andiani");
        Dosen ionia = new Dosen("23456", "332212", "Ionia");
        andiani.getInfo();
        ionia.getInfo();
        System.out.println("\n");
        andiani.absenPagi();
        andiani.ngajar();
        System.out.println("\n");
        ionia.absenPagi();
        ionia.kerja();
        System.out.println("\n");
        ionia.absenPulang();
        andiani.absenPulang();
    }
}
