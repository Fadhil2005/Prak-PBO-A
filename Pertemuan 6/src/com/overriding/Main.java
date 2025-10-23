package com.overriding;

public class Main {
  public static void main(String[] args) {
   bangunDatar bangunDatar = new bangunDatar();
   Lingkaran el = new Lingkaran(7);
   
   bangunDatar.luas();
   bangunDatar.keliling();

   System.out.println("Luas lingkaran " + el.luas());
   System.out.println("Keliling lingkaran " + el.keliling());
  }
}
